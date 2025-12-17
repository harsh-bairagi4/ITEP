import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n;
            n--;
           
        }
         System.out.println("Total sum is " + sum);
    }
}