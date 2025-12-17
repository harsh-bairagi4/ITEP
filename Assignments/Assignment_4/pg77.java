import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();

        int ch = 1;
        for(int i = 1; i <= n; i++){
            ch = i % 2 == 0 ? 0 : 1;
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}