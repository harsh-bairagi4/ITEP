import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the volume of cylinder: ");
        double volume = sc.nextDouble();

        System.out.println("Enter the radius of cylinder: ");
        double radius = sc.nextDouble();

        System.out.println("Enter the height of cylinder: ");
        double height = sc.nextDouble();

        double area = 2 * 3.14f * radius * (h + radius);

        System.out.println("The surface area of cylinder is " +area);

    }
}