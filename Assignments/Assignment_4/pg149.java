import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        int c = 0;
        for(int i = 1; i < n * 2; i++){
            c = i > n ? 2 * n - i : i;
            for(int j = 1; j <= c; j++){
                if(j == 1 || j == c){
                     System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
}