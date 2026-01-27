package main.asm3;

public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct(String productID, String name, double price, int warrantyMonths) {
        super(productID,name,price);
        this.warrantyMonths = warrantyMonths;
    }
    public String getInfo(){
        return  super.getInfo() + ",HBH: " + warrantyMonths +"tháng";
    }
    public double calculateDiscountedPrice(){
        if(getPrice()>10000000){
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}
