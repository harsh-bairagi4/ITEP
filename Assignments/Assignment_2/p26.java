import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of path: ");
        float length = sc.nextFloat();

        System.out.println("Enter the breadth of path: ");
        float breadth = sc.nextFloat();

        System.out.println("Enter the length of brick: ");
        float b_len = sc.nextFloat()/100;

        System.out.println("Enter the breadth of brick: ");
        float b_wid = sc.nextFloat()/100;

        float path_area = length * breadth;
        float brick_area = b_len * b_wid;

        float num_brick = path_area/brick_area;

        System.out.println("Total number of bricks "+num_brick);
    }
}