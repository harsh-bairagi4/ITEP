package dao;

import model.Employee;

public interface EmployeeDAO {
  void addEmployee(Employee emp);
  void viewEmployee();
  void updateEmployee(int id, Employee e);
  void deleteEmployee(int id);

}
