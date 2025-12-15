import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the surface area of cylinder: ");
        float area = sc.nextFloat();

        System.out.println("Enter the height of cylinder: ");
        float height = sc.nextFloat();
        
        float radius = area / (2 * 3.14f * height);
        float diameter = radius * 2;

        System.out.println("The diameter of cylinder: "+ diameter);
    }
}