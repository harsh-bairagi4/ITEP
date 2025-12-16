import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side length of triangle: ");
        double a = sc.nextDouble();

        System.out.println("Enter the second side length of triangle: ");
        double b = sc.nextDouble();

        System.out.println("Enter the third side length of triangle: ");
        double c = sc.nextDouble();

        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c){
                System.out.println("The triangle is equilateral. ");
            }
            else if(a == b || b == c || a == c){
                System.out.println("The triangle is isosceles.");
            }
            else{
                System.out.println("The triangle is scalene");
            }
        }
        else{
            System.out.println("The sides do no form a valid triangle.");
        }
    }
}