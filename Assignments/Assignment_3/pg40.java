import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        double cp = sc.nextDouble();
        System.out.println("Enter selling price: ");
        double sp = sc.nextDouble();

        if(sp > cp){
            System.out.println("Profit = "+ (sp - cp));
        }
        else if(cp > sp){
            System.out.println("Loss = "+ (cp - sp));
        }
        else{
            System.out.println("No Profit, No Loss.");
        }
    }
}