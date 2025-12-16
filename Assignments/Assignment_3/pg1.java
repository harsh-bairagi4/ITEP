import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        double breadth = sc.nextDouble();
        if(length == breadth){
            System.out.println("It is a square ");
        }
        else{
            System.out.println("It is a rectangle");
        }
    }
}