package main.section2;

public class Main {
    public static void main(String[] args){
        //program
        // c la 1 bien co KDL la Car duoc tao ra tu class Car
        Car c= new Car(); // tao ra 1 object tu class Car, c la bien(object)
        c.brand = "Toyota";
        c.year = 2020;
        c.run();
        c.maintain();

        System.out.println("Hãng xe: "+c.brand);

        boolean check = c.checkDate();
        if (check){
            System.out.println("Xe còn hạn sử dụng");
        }else {
            System.out.println("Xe hết hạn sử dụng");
        }

        Car b = new Car("BMW",2029);
        b.year = 2029;
        b.checkDate();

        Car d = new Car("Honda",2028);

        Tamgiac tg = new Tamgiac(3,4,5);
        System.out.println("Chu vi:"+tg.chuvi());
        System.out.println("Diện tích:"+tg.dientich());
    }
}
