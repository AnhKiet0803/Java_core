package main.asm4.nhanvien;

public class Employee {
    private String name;
    private String Id;

    public Employee() {
    }

    public Employee(String name, String id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Double getSalary(){
        return 0.0;
    }
}
