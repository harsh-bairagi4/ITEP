import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();

        for(int i = 1; i < 2*value; i++){
            int c = i > value ? i - value : value - i;
            for(int space = 0; space < c; space++){
                System.out.print(" ");
            }
            int k = i > value ? 2 * (2*value-1-i): 2 * i - 2 ;
            for(int j = 0; j <= k; j++){
               System.out.print("*");
                
            }
            System.out.println();
        }
    }
}