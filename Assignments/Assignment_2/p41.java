import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diameter: ");
        double diameter = sc.nextDouble();

        double radius = diameter / 2;

        System.out.println("Enter the height: ");
        double height = sc.nextDouble();

        double volume = 3.14 * radius * radius * height;

        System.out.println("Volume is "+ volume);
    }
}