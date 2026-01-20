package main.section2;

public class Car {

    // attribute
    String brand; // class variable
    Integer year;

    //constructor: hàm khởi tạo có tên giống class nhưng kco KDL trả về
    public Car(){ // hàm khởi tạo k tham số
        System.out.println("ABC XYZ ...");
    }
    public Car(String brand, Integer year){ // hàm khởi tạo có tham số
        this.brand = brand;
        this.year = year;
    }

    //method
    public void run(){
        System.out.println(this.brand+" is running . . .");
    }
    public void maintain(){
        System.out.println(this.brand+" is maintaining . . .");
    }

    // ham kiem tra xem da qua han chua, gia dinh 10 nam se het date
    public boolean checkDate(){
        int now = 2026;
        int yearP = this.year;// this: là đối tượng ngầm mặc định
        if (now - yearP > 10){
            return false;
        }else {
            return true;
        }
    }
}
