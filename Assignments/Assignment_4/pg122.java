import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            for(int space = 0; space < i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= m - i; j++){
                if(i == 0 || j == 1 || j == m - i){
                    System.out.print(j);
                }else{
                    System.out.print("_");
                }
                
            }
            System.out.println();
        }
    }
}