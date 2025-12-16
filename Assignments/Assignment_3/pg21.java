import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        if(num1 > num2){
            System.out.println(num1+ " is greater than "+ num2);
        } 
        else{
            if(num2 > num1){
                 System.out.println(num2+ " is greatan than "+num1);
            }
            else{
                System.out.println("Both the numbers are equal");
            }
           
        }
        
    }
}