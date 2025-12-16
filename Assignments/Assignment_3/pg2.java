import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity : ");
        double quantity = sc.nextDouble();
        double cost = quantity * 100;
        if(cost > 1000){
            double discount = cost * 0.10;
            cost -= discount;
        }
        System.out.println("Amount to be paid: "+ cost);

    }
}