package main.asm4.phuongtiengiaothong;

public class Train extends Vehicle{
    public Train() {
    }

    public Train(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Train is running . . .");
    }
}
