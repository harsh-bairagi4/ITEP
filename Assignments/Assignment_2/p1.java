import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of rectangle: ");
        int perimeter = sc.nextInt();

        System.out.println("Enter the length: ");
        int length = sc.nextInt();

        System.out.println("The breadth of the rectangle is: ");
        int breadth = (perimeter / 2) - length;

        System.out.println(breadth);
    }
}