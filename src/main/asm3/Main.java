package main.asm3;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Product> products = new ArrayList<>();
        Product sp1 = new ElectronicProduct("001","Laptop Acer nitro5",24000000,24);
        Product sp2 = new FoodProduct("002","Bánh Chocopie",48000,7);
        Product sp3 = new ClothingProduct("003","Quần Jean",330000,"M");

        products.add(sp1);
        products.add(sp2);
        products.add(sp3);

        for (Product p : products) {
            System.out.println("Thong tin san pham:");
            System.out.println(p.getInfo());

            System.out.println("Gia sau giam:");
            System.out.println(p.calculateDiscountedPrice());

            System.out.println("----------------------");
        }
    }
}
