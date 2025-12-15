import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the area of rectangle: ");
        int area = sc.nextInt();

        System.out.print("Enter the breadth of rectangle: ");
        int breadth = sc.nextInt();

        int length = area/breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Length of rectangle is: " + length);
        System.out.print("Perimeter of rectangle is: " + perimeter);
    }
}