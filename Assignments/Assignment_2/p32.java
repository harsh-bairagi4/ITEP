import java.util.Scanner;

class Test{
    public static void main(String args[]){
        System.out.println("Enter the garden length: ");
        int garden_len = sc.nextInt();
        System.out.println("Enter the pool length: ");
        int pool_len = sc.nextInt();

        int garden_area = garden_len * garden_len;
        int pool_area = pool_len * pool_len;

        int ans = garden_area - pool_area;

        System.out.println("The answer is "+ ans);
    }
}