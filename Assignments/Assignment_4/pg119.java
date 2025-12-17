import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            char ch = '0';
            for(int space = 0; space < n - i - 1; space++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                ch = ch == '0' ? '1' : '0';
                System.out.print(ch);
            }
            System.out.println();
        }
   }
}