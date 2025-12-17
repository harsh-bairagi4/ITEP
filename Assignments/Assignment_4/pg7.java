import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        int a = 0;
        int b  = 1;
        while(i <= n){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}