import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = (num / 2) * 2;

        if(result == num){
            System.out.println(num + " is Even");
        }
        else{
            System.out.println(num + " is Odd");
        }
    }
}