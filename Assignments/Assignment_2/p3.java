import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of tile: ");
        int tile_length = sc.nextInt();

        System.out.print("Enter the breadth of tile: ");
        int tile_breadth = sc.nextInt();

        int tile_area = tile_length * tile_breadth;
        
        System.out.print("Enter the length of rectangular region: ");
        int r_len = sc.nextInt();

        System.out.print("Enter the breadth of rectangular region: ");
        int r_bre = sc.nextInt();

        int r_area = r_len * r_bre;

        int answer = r_area/tile_area;
        System.out.println(answer + "will be needed to cover a rectangular region");
    }
}