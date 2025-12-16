import java.util.Scanner;

class Test{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = sc.nextDouble();

        if(num1> num2 && num1 > num3){
            System.out.println(num1 + " is the greatest among all numbers");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the greatest among all numbers");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the greatest among all numbers");
        }
        else{
            System.out.println("All the numbers are equal");
        }
    }
}