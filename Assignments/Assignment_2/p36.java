import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the diameter of cylinder: ");
        double d = sc.nextDouble();

        double r = d / 2;
        System.out.println("Enter the height of cylinder: ");
        double h = sc.nextDouble();

        double area = 2 * 3.14 * r * h;
        System.out.println("The area of cylinder is " + area);
    }
}