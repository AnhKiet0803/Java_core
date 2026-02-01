package main.asm4.nhanvien;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Nguyen Van A","nvft001",15000000.0));
        employees.add(new PartTimeEmployee("Tran Thi B","nvpt001",100,100000.0));
        System.out.println("Nhân viên công ty:");
        for (Employee p:employees){
            System.out.println("Tên nv: "+p.getName() +", Mã nv: "+ p.getId() +", Lương nv: "+p.getSalary());
        }
    }
}
