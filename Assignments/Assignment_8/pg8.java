import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand name: ");
        String brand = sc.nextLine();
        System.out.println("Enter the model name: ");
        String model = sc.nextLine();
        System.out.println("Enter the price: ");
        int price = sc.nextInt();

        Mobile mobile1 = new Mobile();
        mobile1.setBrand(brand);
        mobile1.setModel(model);
        mobile1.setPrice(price);

        System.out.println("Brand: " +  mobile1.getBrand());
        System.out.println("Model: " + mobile1.getModel());
        System.out.println("Price: "+ mobile1.getPrice());
        System.out.println("Is affordable: " + mobile1.isAffordable());
        
    }
}
class Mobile{
    private String brand;
    private String model;
    private int price;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int getPrice(){
        return this.price;
    }
    public boolean isAffordable(){
        return this.price < 20000;
    }
}