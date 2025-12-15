import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost: ");
        int cost = sc.nextInt();
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the rate: ");
        int rate = sc.nextInt();
        int perimeter = cost/rate;
        int breadth = (perimeter/2) - length;
        int area = length * breadth;
        System.out.println(breadth);
        System.out.println(perimeter);
        System.out.println(area);
    }
}