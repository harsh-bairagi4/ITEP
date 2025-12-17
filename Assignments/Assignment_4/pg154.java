import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int space = 1; space <= row - i; space++){
                System.out.print(" ");
            }
            for(int j = i; j > 1; j--){
                System.out.print(j);
            }
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}