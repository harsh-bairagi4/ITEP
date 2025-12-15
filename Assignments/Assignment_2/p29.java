import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of tile: ");
        int length = sc.nextInt();

        int tile_area = length * length;

        int floor_area = 800 * 900;
        int ans = floor_area/tile_area;

        System.out.println("The answer is : "+ ans);
    }
}