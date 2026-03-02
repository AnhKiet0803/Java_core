package main.section7;

import java.sql.*;
import java.time.LocalDate;
public class Mainbuoi1 {
    public static void main (String[] args){
        String connectionsString = "jdbc:mysql://localhost:3306/t2507e_jp";
        String user = "root";
        String password = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionsString,user,password);
            // lấy thông tin sinh viên
            String sql = "select * from student";
            Statement stt = conn.createStatement();
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                Integer Id = rs.getInt("id");
                String Name = rs.getNString("name");
                LocalDate DOB = rs.getDate("dob").toLocalDate();
                Integer Mark = rs.getInt("mark");
                System.out.println("Id: "+Id +", " +"Name: "+Name + ", "+"Date: "+DOB + ", " +"Mark: "+Mark);
            }

            // thêm 1 sinh viên
            String sql1 = "insert into student(name,dob,mark) values('Nguyễn Ngọc C','2003-07-30',8)";
            stt.execute(sql1);

            // Cách dưới đây giống cách trên dùng cái nào cũng được
            String sql2 = "INSERT INTO student(name,dob,mark) VALUES(?,?,?)";
            PreparedStatement pt = conn.prepareStatement(sql2);
            pt.setString(1,"Phạm Khánh D");
            pt.setDate(2,Date.valueOf("1990-04-15"));
            pt.setInt(3,9);
            pt.execute();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
