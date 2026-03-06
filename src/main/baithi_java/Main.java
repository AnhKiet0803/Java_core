package main.baithi_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin sản phẩm");

        System.out.print("ID: ");
        Integer id = sc.nextInt();
        sc.nextLine();

        System.out.print("Tên sản phẩm: ");
        String name = sc.nextLine();

        System.out.print("Thumbnail: ");
        String thumbnail = sc.nextLine();

        Double price;
        do {
            System.out.print("Giá sản phẩm: ");
            price = sc.nextDouble();
            if(price < 0){
                System.out.println("Giá sản phẩm không được âm");
            }
        } while(price < 0);

        Integer qty;
        do {
            System.out.print("Số lượng tồn kho: ");
            qty = sc.nextInt();
            if(qty < 0){
                System.out.println("Số lượng tồn kho không được âm");
            }
        } while(qty < 0);

        sc.nextLine();

        System.out.print("Mô tả: ");
        String description = sc.nextLine();

        Product p = new Product(id, name, thumbnail, price, qty, description);

        System.out.println("Thông tin sản phẩm:");
        p.displayInfo();


        Integer orderQty;
        do {
            System.out.print("Nhập số lượng bạn muốn đặt hàng: ");
            orderQty = sc.nextInt();

            if(orderQty <= 0){
                System.out.println("Số lượng đặt cần lớn hơn 0");
            }
        } while(orderQty <= 0);

        if(p.checkAvailability(orderQty)){
            Double total = p.placeOrder(orderQty);
            System.out.println("Bạn đã đặt hàng thành công");
            System.out.println("Số lượng bạn đã đặt: " + orderQty);
            System.out.println("Tổng tiền của bạn là: " + total);
            System.out.println("Thông tin sản phẩm còn tồn lại:");
            p.displayInfo();
        } else {
            System.out.println("Xin lỗi, số lượng hàng tồn trong kho không đủ để đặt hàng");
        }

    }
}
