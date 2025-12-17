import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

         for (int row = 0; row < 2*n; row++){
            int c = row < n ? n - row: row - n + 1 ;
            for (int col1 = 0; col1 < c; col1++){
                System.out.print("*");
            }
            for (int space = 0; space < (n-c)*2; space++){
                System.out.print(" ");
            }
            for (int col2 = 0; col2 < c; col2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}