import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();
        int area = l * b;
        int ans = area * 6;
        System.out.println("Area of rectangle is : " + ans);

    }
}