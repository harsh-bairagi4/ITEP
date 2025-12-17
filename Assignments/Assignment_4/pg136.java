import java.util.Scanner; 

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            
            for(int space = 0; space < m - i - 1; space++){
                System.out.print(" ");
            }
            for(int j = 0; j <= 2 * i; j++){
                if(j == 0 || j == 2 * i || i == m - 1){
                      System.out.print("1");
                }
                else{
                    System.out.print("*");
                }
              
                
            }
            System.out.println();
        }
    }
}