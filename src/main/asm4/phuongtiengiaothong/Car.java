package main.asm4.phuongtiengiaothong;

public class Car extends Vehicle{
    public Car() {
    }

    public Car(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Car is driving . . .");
    }
}
