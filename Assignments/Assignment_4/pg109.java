import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        int num = n - 1;
        for(int i = 1; i <= n; i++){
               if(i % 2 == 0){
                for(int j = n-i + 1; j >= 1; j--){
                System.out.print(j);
                }
               }
               else{
                for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
                }
               }
            System.out.println();
        }
    }
}