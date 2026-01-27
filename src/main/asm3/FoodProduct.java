package main.asm3;

public class FoodProduct extends Product{
    private int expiryDays;

    public FoodProduct(String productID, String name, double price, int expiryDays) {
        super(productID, name, price);
        this.expiryDays = expiryDays;
    }
    public String getInfo() {
        return super.getInfo() + ", HSD còn lại: " + expiryDays + " ngày";
    }
    public double calculateDiscountedPrice() {
        if (expiryDays <= 3) {
            return getPrice() * 0.7;
        } else if (expiryDays <= 7) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}
