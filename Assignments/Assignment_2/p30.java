import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of tile: ");
        int tile_len = sc.nextInt();
        System.out.println("Enter the breadth of tile: ");
        int tile_bre = sc.nextInt();

        System.out.println("Enter the floor length: ");
        int floor_len = sc.nextInt();
        System.out.println("Enter the floor breadth: ");
        int floor_wid = sc.nextInt();

        int tile_area = tile_len * tile_bre;
        int floor_area = floor_len * floor_wid;

        int ans = floor_area/tile_area;

        System.out.println(ans);

    }
}