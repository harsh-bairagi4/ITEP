import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of employee: ");
        int id = sc.nextInt();

        System.out.println("Enter the name of employee: ");
        String name = sc.next();

        System.out.println("Enter the salary of employee: ");
        int salary = sc.nextInt();

        Employee employee1 = new Employee();
        employee1.setId(id);
        employee1.setSalary(salary);
        employee1.setName(name);

        System.out.println("Id: " + employee1.getId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
        
       
    }
}
class Employee{
    private int id;
    private String name;
    private int salary;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }
}