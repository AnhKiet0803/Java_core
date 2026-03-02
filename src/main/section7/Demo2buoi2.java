package main.section7;


import main.dao.SubjectDaoImpl;
import main.entity.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo2buoi2 {
    public static void main (String[] args){
        try{
            SubjectDaoImpl subjectDao = new SubjectDaoImpl();
            ArrayList<Subject> arr = subjectDao.getAll();
            Scanner scanner = new Scanner(System.in);

            for (Subject s :arr){
                System.out.println("Id: "+ s.getId() +",Name: "+ s.getName() +",Hours: "+ s.getHours());
            }

            System.out.println("Thêm môn học");
            System.out.print("Nhập tên môn học: ");
            String name = scanner.nextLine();
            System.out.print("Nhập số giờ học: ");
            Integer hours = Integer.parseInt(scanner.nextLine());

            Subject newSubject = new Subject(null, name, hours);
            boolean result = subjectDao.create(newSubject);
            if (result) {
                System.out.println("Thêm môn học thành công!");
            } else {
                System.out.println("Thêm môn học thất bại!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
