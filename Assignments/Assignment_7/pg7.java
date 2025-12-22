import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        
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
            int maxRow = 0;
            int max = 0;
            for(int i = 0; i < m; i++){
                int sum = 0;
                for(int j = 0; j < n; j++){
                  sum += arr[i][j];
                  if(sum > max){
                    max = sum;
                    maxRow = i;
                  }           
                }
            }
            System.out.println("The max is " + max);

          
                for(int j = 0; j < arr[maxRow].length ; j++){
                    System.out.print(arr[maxRow][j] + " ");
                }
            
        }
        
    }
