import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
              char ch = 'A';
            for(int space = 0; space < n-i-1; space++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
              
                if(i == n - 1 || j == 0 || j == i){
                    System.out.print(ch);
                   ch++;
                }
                else{
                    System.out.print("_");
                    ch++;
                }
                 
                
            }
              System.out.println();
        }
    }
}