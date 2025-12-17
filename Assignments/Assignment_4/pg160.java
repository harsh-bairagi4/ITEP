import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= m; j++){
                if(i == j || j == m - i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
    }
}