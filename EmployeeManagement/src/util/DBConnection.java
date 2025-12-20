package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection con;
    private static final String CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/employee_management";
    private static final String USER = "";
    private static final String PASS = "";

    public static Connection getConnection(){
        try{
            Class.forName(CLASS_NAME);
            con = DriverManager.getConnection(URL, USER, PASS);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
