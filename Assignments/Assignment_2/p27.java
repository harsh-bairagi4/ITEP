import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        int length = sc.nextInt();

        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int ans = area * 5;
        System.out.println("The answer is "+ ans);
    }
}