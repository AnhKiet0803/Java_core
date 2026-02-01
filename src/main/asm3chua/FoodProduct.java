package main.asm3chua;

public class FoodProduct extends Product{
    private Integer expiryDays;

    public FoodProduct(Integer expiryDays) {
        this.expiryDays = expiryDays;
    }
    public FoodProduct(){

    }
    public FoodProduct(String productId, String name, Double price, Integer expiryDays) {
        super(productId, name, price);
        this.expiryDays = expiryDays;
    }

    public Integer getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(Integer expiryDays) {
        this.expiryDays = expiryDays;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" ,Expired: "+getExpiryDays()+" day";
    }

    @Override
    public Double calculateDiscountedPrice() {
        if (getExpiryDays() <= 3)
            return getPrice() * 7/10;
        else if (getExpiryDays() <= 7)
            return getPrice() * 9/10;
        return getPrice();
    }
}
