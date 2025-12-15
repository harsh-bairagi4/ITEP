import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the volume of carton: ");
        int volume_carton = sc.nextInt();
        System.out.println("Enter the volume of cube: ");
        int volume_cube = sc.nextInt();
        int boxes = volume_carton/volume_cube;
        System.out.println(boxes);
    }
}