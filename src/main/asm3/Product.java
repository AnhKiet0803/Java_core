package main.asm3;

public class Product {
    private String productID;
    private String name;
    private double price;

    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >=0){
            this.price = price;
        }
    }
    public String getInfo(){
        return "Mã sp: " + productID + ", Tên sp: " + name + ",Giá: " + price +"vnd";
    }
    public double calculateDiscountedPrice(){
        return price;
    }
}