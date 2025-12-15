import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of triangle: ");
        int a = sc.nextInt();
        System.out.println("Enter the side of triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter the perimeter of triangle: ");
        int perimeter = sc.nextInt();
        int c = perimeter - a - b;
        int s = perimeter/2;
        int area = s * (s-a) * (s-b) * (s-c);
        area = (int)Math.sqrt(area);
        
        System.out.println(area);
    }
}