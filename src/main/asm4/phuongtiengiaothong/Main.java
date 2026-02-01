package main.asm4.phuongtiengiaothong;

public class Main {
    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0]= new Car("BMW",300);
        vehicles[1]= new Bike("Honda_Vision",90);
        vehicles[2]= new Train("Cát Linh - Hà Đông",400);
        vehicles[3]= new Plane("Vietjet",900);
        for (Vehicle p: vehicles){
            System.out.println("Vehicle: "+ p.getName());
            System.out.println("Max speed: "+ p.getMaxSpeed());
            System.out.println("------------------------------------");
        }
    }
}
