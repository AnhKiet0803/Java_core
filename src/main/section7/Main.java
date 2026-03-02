package main.section7;


import main.dao.StudentDaoImpl;
import main.entity.Student;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        try{
            StudentDaoImpl studentDao = new StudentDaoImpl();
            ArrayList<Student> arr = studentDao.getAll();
            Scanner scanner = new Scanner(System.in);

            for (Student s : arr) {
                System.out.println("Id: "+ s.getId()
                        +",Name: "+ s.getName()
                        +",DOB: "+ s.getDob()
                        + ",Mark: " + s.getMark());
            }
            System.out.println("Thêm sinh viên");
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập ngày sinh (yyyy-mm-dd): ");
            String dobStr = scanner.nextLine();
            LocalDate dob = LocalDate.parse(dobStr);
            System.out.print("Nhập điểm: ");
            Integer mark = Integer.parseInt(scanner.nextLine());
            Student newStudent = new Student(null, name, dob, mark);
            boolean result = studentDao.create(newStudent);
            if (result) {
                System.out.println("Thêm sinh viên thành công!");
            } else {
                System.out.println("Thêm sinh viên thất bại!");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
