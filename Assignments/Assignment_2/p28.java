import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");

        int l = sc.nextInt();

        System.out.println("Enter the breadth: ");

        int b = sc.nextInt();

        int area = l * b;
        int ans = area * 205;
        System.out.println("The answer is "+ ans);
    }
}