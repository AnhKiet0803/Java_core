package main.baithi_java;

public class Product {
    private Integer id;
    private String name;
    private String thumbnail;
    private Double price;
    private Integer qty;
    private String description;

    public Product() {
    }

    public Product(Integer id, String name, String thumbnail, Double price, Integer qty, String description) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.price = price;
        this.qty = qty;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Description: " + description);
    }

    public boolean checkAvailability(Integer orderQty){
        if(orderQty <= qty){
            return true;
        }else{
            return false;
        }
    }

    public double placeOrder(Integer orderQty) {
        if(checkAvailability(orderQty)){
            qty = qty - orderQty;
            return orderQty * price;
        }else{
            System.out.println("Số lượng hàng tồn không đủ");
            return 0;
        }
    }
}
