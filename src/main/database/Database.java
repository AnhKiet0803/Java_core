package main.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Database {
    private static final String connectionsString = "jdbc:mysql://localhost:3306/t2507e_jp";
    private static final String user = "root";
    private static final String password = "root";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection conn;

    //Singleton Pattern
    private static Database _instance;

    private Database(){
        try{
            Class.forName(driver);
            this.conn = DriverManager.getConnection(connectionsString,user,password);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public Statement getStatement() throws Exception{
        return conn.createStatement();
    }
    public PreparedStatement getPreparedStatement(String sql) throws Exception{
        return conn.prepareStatement(sql);
    }
    public static Database getInstance(){
        if (_instance == null){
            _instance = new Database();
        }
        return _instance;
    }
}
