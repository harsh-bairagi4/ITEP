import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int first = 1;
        int second = 2;
        System.out.print(first + " " + second + " ");
        int i = 1;
        while(i <= n-2){
            int product = first * second;
            System.out.print(product + " ");
            first = second;
            second = product;
            i++;
        }
    }

}