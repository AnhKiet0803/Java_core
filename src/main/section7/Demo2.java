package main.section7;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String connectionString = "jdbc:mysql://localhost:3306/t2507e_jp";
        String user = "root";
        String password = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString, user, password);

            while (true) {
                System.out.println("1. Hiển thị tất cả môn học");
                System.out.println("2. Thêm môn học");
                System.out.println("3. Tra cứu môn học theo tên");
                System.out.println("0. Thoát");
                System.out.print("Chọn: ");

                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    String sql = "SELECT * FROM subject";
                    Statement stt = conn.createStatement();
                    ResultSet rs = stt.executeQuery(sql);
                    while (rs.next()) {
                        Integer id = rs.getInt("id");
                        String name = rs.getString("name");
                        Integer hours = rs.getInt("hours");
                        System.out.println("Id: " + id + ", Name: " + name + ", Hours: " + hours);
                    }
                } else if (choice == 2) {
                    System.out.print("Nhập tên môn: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số giờ học: ");
                    Integer hours = Integer.parseInt(scanner.nextLine());

                    String sql = "INSERT INTO subject(name, hours) VALUES(?, ?)";
                    PreparedStatement pt = conn.prepareStatement(sql);
                    pt.setString(1, name);
                    pt.setInt(2, hours);
                    pt.execute();
                    System.out.println("Thêm môn học thành công!");
                } else if (choice == 3) {
                    System.out.print("Nhập tên môn cần tìm: ");
                    String keyword = scanner.nextLine();

                    String sql = "SELECT * FROM subject WHERE name LIKE ?";
                    PreparedStatement pt = conn.prepareStatement(sql);
                    pt.setString(1, "%" + keyword + "%");
                    ResultSet rs = pt.executeQuery();
                    boolean found = false;

                    while (rs.next()) {
                        found = true;
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        int hours = rs.getInt("hours");
                        System.out.println("Id: " + id + ", Name: " + name + ", Hours: " + hours);
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy môn học!");
                    }
                } else if (choice == 0) {
                    System.out.println("Thoát chương trình.");
                    break;
                } else {
                    System.out.println("Lựa chọn không hợp lệ!");
                }
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}