package dao;

import model.Employee;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDAOImpl implements  EmployeeDAO{
    @Override
    public void addEmployee(Employee emp){
        String sql = "insert into employee(name, email, salary, department) values(?,?,?,?)";
        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setDouble(3, emp.getSalary());
            ps.setString(4, emp.getDepartment());
            int x = ps.executeUpdate();
            if(x != 0){
                System.out.println("Record inserted successfully");
            }
            else{
                System.out.println("Record not inserted...");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void viewEmployee(){
        String sql = "select * from employee";
        try(Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) {
            ResultSet rs =  st.executeQuery(sql);
            while(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                double salary = rs.getDouble(4);
                String department = rs.getString(5);
                System.out.println(id+" "+name+" "+ email + " "+ salary + " "+ department);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void updateEmployee(int id, Employee e){
        String sql = "update employee set name = ?, email = ?, salary = ?, department = ?  where id = ?";
        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setDouble(3, e.getSalary());
            ps.setString(4, e.getDepartment());
            ps.setInt(5, id);
            int x = ps.executeUpdate();
            if(x != 0){
                System.out.println("Record updated successfully");
            }
            else{
                System.out.println("Record not updated...");
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void deleteEmployee(int id){
        String sql = "delete from employee where id = ?";
        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id);
            int x = ps.executeUpdate();
            if(x != 0){
                System.out.println("Record deleted successfully");
            }
            else{
                System.out.println("Record not deleted...");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
