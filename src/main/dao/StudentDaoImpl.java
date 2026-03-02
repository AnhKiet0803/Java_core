package main.dao;

import main.database.Database;
import main.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao{
    private Database db;

    public StudentDaoImpl() {
        this.db = Database.getInstance();
    }

    @Override
    public ArrayList<Student> getAll() {
        ArrayList<Student> arr = new ArrayList<>();
        try{
            Statement st = db.getStatement();
            String sql = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                arr.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDate("dob").toLocalDate(),
                        rs.getInt("mark")
                ));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return arr;
    }

    @Override
    public boolean create(Student student) {
        try{
            String sql = "INSERT INTO student(name,dob,mark) VALUES (?,?,?)";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1,student.getName());
            pt.setString(2,student.getDob().toString());
            pt.setInt(3,student.getMark());

            pt.execute();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        try {
            String sql = "UPDATE student SET name = ?, dob = ?, mark = ? WHERE id = ?";
            PreparedStatement pt = db.getPreparedStatement(sql);

            pt.setString(1, student.getName());
            pt.setString(2, student.getDob().toString());
            pt.setInt(3, student.getMark());
            pt.setInt(4, student.getId());

            pt.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try {
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setInt(1, id);

            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
