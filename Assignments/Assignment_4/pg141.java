import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int space = 0; space < i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j < 2 * n - 2 * i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}