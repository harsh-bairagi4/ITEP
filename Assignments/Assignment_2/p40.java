import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.prinln("Enter the radius : ");
        double radius = sc.nextDouble();

        System.out.prinln("Enter the height: ");
        double height = sc.nextDouble();

        double volume = 3.14 * radius * radius * height;

        System.out.prinln("The volume is "+ volume);
    }
}