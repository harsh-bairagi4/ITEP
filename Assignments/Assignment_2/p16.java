import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int b = sc.nextInt();
        int area = l * b;
        System.out.println(area);
        
    }
}