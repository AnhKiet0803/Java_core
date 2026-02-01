package main.asm3chua;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new ElectronicProduct("SP1"," Tủ lạnh Toshiba",15000000.0,24));
        products.add(new FoodProduct("SP2","Táo Envy",100000.0,5));
        products.add(new ClothingProduct("SP3","Áo T-shirt",250000.0,"M"));
        for (Product p: products){
            System.out.println("Các SP");
            System.out.println(p.getInfo());
            System.out.println("----------------------");
        }
    }
}
