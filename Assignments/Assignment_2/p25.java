import java.util.Scanner;

class Test{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of brick: ");
        int len = sc.nextInt();

        System.out.println("Enter the breadth of brick: ");
        int bre = sc.nextInt();

        int area_brick = len * bre;
        
        int ans = area_brick * 100;
        System.out.println(ans);
    }
}