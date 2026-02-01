package main.asm4.nhanvien;

public class FullTimeEmployee extends Employee {
    private Double salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, String id, Double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
