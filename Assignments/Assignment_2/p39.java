import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of cylinder: ");
        double diameter = sc.nextDouble();

        double radius = diameter / 2;
        System.out.println("Enter the height of cylinder: ");
        double height = sc.nextDouble();

        double area = 2 * 3.14 * radius * (height + radius);
        System.out.println("The area of cylinder is " + area);
    }
}