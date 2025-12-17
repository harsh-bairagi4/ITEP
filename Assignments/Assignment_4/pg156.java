import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n-row+1; col++){
                System.out.print("*");
            }
            for (int space = 0; space < (2*n) - (2); space++){
                System.out.print(" ");
            }
            for (int col = n-row+1; col >= 1; col--){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}