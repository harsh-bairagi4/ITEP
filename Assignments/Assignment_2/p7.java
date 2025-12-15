import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle: ");
        int base = sc.nextInt();
        System.out.println("Enter the area of triangle: ");
        int area = sc.nextInt();
        int height = (2*area)/base;
        System.out.println(height);
    }
}