import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of cube: ");
        int side = sc.nextInt();
        int volumeofcube = side * side * side;
        System.out.println("Enter the length of cuboid: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of cuboid: ");
        int b = sc.nextInt();
        System.out.println("Enter the height of cuboid: ");
        int h = sc.nextInt();
        int volumeofcuboid = l * b * h;
        System.out.println(volumeofcube);
        System.out.println(volumeofcuboid);
    }
}