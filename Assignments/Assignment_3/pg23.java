import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        if(num1 % 2 != 0){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
}