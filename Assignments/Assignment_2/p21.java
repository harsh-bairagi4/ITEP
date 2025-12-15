import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        System.out.println("Enter the height: ");
        int height = sc.nextInt();

        int b_volume = length * breadth * height;

        System.out.println("Enter the wall length: ");
        int wall_length = sc.nextInt() * 100;

        System.out.println("Enter the wall breadth: ");
        int wall_breadth = sc.nextInt() * 100;

        System.out.println("Enter the wall height: ");
        int wall_height = sc.nextInt() * 100;

        long wall_volume = wall_length * wall_breadth * wall_height;
        long total_brick = wall_volume / b_volume;

        System.out.println("Total bricks: " + total_brick);
         
    }
}