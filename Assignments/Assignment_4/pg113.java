import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int space = 1; space < n - i; space++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}