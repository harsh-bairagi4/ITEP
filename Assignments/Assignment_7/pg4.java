import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        if(m != n){
            System.out.println("Must be a square matrix");
        }
        else{
            for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt(); 
            }
            }
            System.out.println();

            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(i < j){
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
        
    }
}