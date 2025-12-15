import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Enter the diameter: ");
        double d = sc.nextDouble();

        double r = d/2;

        System.out.println("Enter the height: ");
        double h = sc.nextDouble();

        double volume = pi * r * r * h;
        System.out.println(volume);
    }
}