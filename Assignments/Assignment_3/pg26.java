import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(number < 0){
            number *= -1;
        }    
        int num = number % 2;

        switch(num){
            case 0:
                System.out.println("The number is even");
            break;
            
            case 1:
                System.out.println("The number is odd");
            break;

            default:
                System.out.println("Please enter numbers only");
            
        }
    }
}