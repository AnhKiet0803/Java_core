package main.asm4.nhanvien;

public class PartTimeEmployee extends Employee {
    private Integer hours;
    private Double salaryPerHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, String id, Integer hours, Double salaryPerHours) {
        super(name, id);
        this.hours = hours;
        this.salaryPerHours = salaryPerHours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getSalaryPerHours() {
        return salaryPerHours;
    }

    public void setSalaryPerHours(Double salaryPerHours) {
        this.salaryPerHours = salaryPerHours;
    }

    @Override
    public Double getSalary() {
        return getHours()*getSalaryPerHours();
    }
}
