import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 0; i < n; i++){
            for(int space = 1; space < n - i; space++){
                System.out.print(" ");
            }
            for(int j = 0; j <= 2 * i; j++){
                if(j == 0 || j == 2 * i || i == n - 1){
                      System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
               
                
            }
            System.out.println();
             ch++;
        }
    }
}