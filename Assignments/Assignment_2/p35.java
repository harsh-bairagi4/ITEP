import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of cylinder: ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of cylinder: ");
        float h = sc.nextFloat();

        float area = 2 * 3.14f * r * h;
        System.out.println("The area of cylinder is "+ area);
    }
}