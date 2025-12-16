import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operation you want to perform: ");
        char op = sc.next().charAt(0);
        double result = 0;
        boolean check = true;
        switch(op){
            case '+':
                result = num1 + num2;
            break;
            case '-':
                result = num1 - num2;
            break;
            case '*':
                result = num1 * num2;
            break;
            case '/':
                if(num2!=0){
                    result = num1/num2;
                } 
                else{
                    System.out.println("undefined");
                    check = false;
                }
            break;
            default:
                System.out.println("Enter the correct operator");

        }
        if(check){
            System.out.println(result);
        }
        
    }
}