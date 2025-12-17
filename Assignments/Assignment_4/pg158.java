import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();

        for(int i = 1; i < 2*n; i++){
           for(int j = 1; j < 2*n; j++){
            if(j == n && i < n){
                System.out.print(i);
            }
             else if(i == n && j > n){
                System.out.print(2*n - j);
            }
            else if(i == n){
                System.out.print(j);
            }
           
            else if(j== n && i > n){
                System.out.print(2*n - i);
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
    }
}