package main.asm7;

public abstract class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee() {
    }

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary(); //Tính lương thực nhận của nhân viên

    public abstract String getPosition(); //Trả về chức danh

    public void showInfo(){
        System.out.println("ID: " + id);
        System.out.println("Họ & tên: " + name);
        System.out.println("Chức vụ: " + getPosition());
        System.out.println("Lương cơ bản: " + baseSalary);
        System.out.println("Lương thực tế: " + calculateSalary());
    }
}
