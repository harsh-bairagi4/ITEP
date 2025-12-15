import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of triangle: ");
        int side = sc.nextInt();
        int area = (side * side) / 2;
        System.out.println("The area of triangle is: " + area);
    }
}