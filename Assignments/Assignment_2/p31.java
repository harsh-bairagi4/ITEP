import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of perimeter: ");
        int perimeter = sc.nextInt();

        int side = perimeter / 4;
        int area = side * side;
        System.out.println(area);
    }
}