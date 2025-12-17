import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int m = sc.nextInt();
        int n = 2 * m;

        for(int i = 1; i < n; i++){
            int c = i > m ? i - m : m - i;
            for(int space = 1; space <= c; space++){
                System.out.print(" ");
            }
            int k = i > m ? n - i: i;
            for(int j = 1; j <= k; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}