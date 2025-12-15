import java.util.Scanner;

public Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the area of triangle: ")
        int area = sc.nextInt();
        System.out.println("Enter the base of triangle: ")
        int base = sc.nextInt();
        int height = (2 * area) / base;
        System.out.println(height);
    }
}