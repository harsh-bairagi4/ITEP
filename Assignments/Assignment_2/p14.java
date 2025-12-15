import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diagonal length: ")
        int diagonal = sc.nextInt();
        System.out.println("Enter the length of first vertice: ")
        int side1 = sc.nextInt();
        System.out.println("Enter the length of second vertice: ")
        int side2 = sc.nextInt();

        int area1 = (side1 * diagonal)/2;
        int area2 = (side2 * diagonal)/2;

        int totalArea = area1 + area2;
        System.out.println(totalArea);
    }
}