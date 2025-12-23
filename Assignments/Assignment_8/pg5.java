import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the product id: ");
        int productId = sc.nextInt();
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter the price: ");
        int price = sc.nextInt();

        Inventory product1 = new Inventory();

        product1.setName(name);
        product1.setProductId(productId);
        product1.setQuantity(quantity);
        product1.setPrice(price);

        System.out.println("Name: " +  product1.getName());
        System.out.println("Product Id: " + product1.getProductId());
        System.out.println("Quantity: "+ product1.getProductQuantity());
        System.out.println("Price: "+ product1.getPrice());
        System.out.println("Total value: " + product1.totalValue());
        
    }
}
class Inventory{
    private String name;
    private int productId;
    private int quantity;
    private int price;

    public void setName(String name){
        this.name = name;
    }
    public void setProductId(int id){
        this.productId = id;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public int getProductId(){
        return this.productId;
    }
    public int getProductQuantity(){
        return this.quantity;
    }
    public int getPrice(){
        return this.price;
    }
    public int totalValue(){
        return this.quantity * this.price;
    }
}