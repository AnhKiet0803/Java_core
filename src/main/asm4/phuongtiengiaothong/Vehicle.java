package main.asm4.phuongtiengiaothong;

public class Vehicle {
    private String name;
    private Integer maxSpeed;

    public Vehicle() {
    }

    public Vehicle(String name, Integer maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void move(){
        System.out.println("Vehicle is moving . . .");
    }
}
