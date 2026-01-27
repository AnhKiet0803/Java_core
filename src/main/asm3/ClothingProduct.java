package main.asm3;

public class ClothingProduct extends Product{
    private String size;

    public ClothingProduct(String productID, String name, double price, String size) {
        super(productID, name, price);
        this.size = size;
    }
    public String getInfo() {
        return super.getInfo() + ", Kích thước: " + size;
    }
    public double calculateDiscountedPrice() {
        return getPrice() * 0.85;
    }
}
