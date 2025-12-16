import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three angle of triangle: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b + c == 180 && a > 0 && b > 0 && c > 0){
            System.out.println("The triangle is valid.");
        }
        else{
            System.out.println("The triangle is not valid.");
        }
    }
}