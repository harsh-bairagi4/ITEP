package main;


import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO employee = new EmployeeDAOImpl();
        System.out.println("Welcome to employee management system");
        System.out.println("---------------------------------------");
        while(true){
         System.out.println("Press the task number which you want to perform: ");
         System.out.println("1. Add Employee");
         System.out.println("2. View All Employees");
         System.out.println("3. Update Employee");
         System.out.println("4. Delete Employee");
         System.out.println("5. Exit");
         int choice = sc.nextInt();
        if(choice == 1){
        System.out.println("Enter employee name: ");
        String name = sc.next();
        System.out.println("Enter employee email: ");
        String email = sc.next();
        if(!email.contains("@")){
            System.out.println("Invalid Email");
            break;
        }
        System.out.println("Enter employee salary");
        double salary = sc.nextDouble();
        System.out.println("Enter employee department");
        String department = sc.next();
        Employee emp = new Employee(name, email, salary, department);
        employee.addEmployee(emp);
        }
        else if(choice == 2){
            System.out.println("ID Name Email Salary Department");
            employee.viewEmployee();
        }
        else if(choice == 3){
        System.out.println("Enter the employee id to update: ");
        int id = sc.nextInt();
        System.out.println("Enter employee name: ");
        String name = sc.next();
        System.out.println("Enter employee email: ");
        String email = sc.next();
        System.out.println("Enter employee salary");
        double salary = sc.nextDouble();
        System.out.println("Enter employee department");
        String department = sc.next();
        Employee emp = new Employee(name, email, salary, department);
        employee.updateEmployee(id, emp);
        }
        else if(choice == 4){
        System.out.println("Enter the employee id to delete: ");
        int id = sc.nextInt();
        employee.deleteEmployee(id);
         }
        else{
            System.out.println("Bye Bye");
            break;
        }
}


    }
}