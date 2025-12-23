import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand name: ");
        String brand = sc.nextLine();
        System.out.println("Enter the model name: ");
        String model = sc.nextLine();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        Car car1 = new Car();
       
        car1.setBrand(brand);
        car1.setModel(model);
        car1.setYear(year);

        System.out.println("Brand: " +  car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: "+ car1.getYear());
        
    }
}
class Car{
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
}