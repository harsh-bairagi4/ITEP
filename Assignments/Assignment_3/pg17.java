import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        System.out.println("The area of rectangle is "+ area);
    }
}