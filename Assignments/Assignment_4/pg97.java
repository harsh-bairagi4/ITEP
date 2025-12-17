import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int k = 1;
            for(int j = 0; j <=i ;j++){
                if(j == 0 || j == i){
                    System.out.print(k);
                }
                else if(i == n-1){
                    System.out.print(k);
                }
                else{
                    System.out.print(" ");
                }
                k = (k == 1)? 0 : 1;
            }
            System.out.println();
        }
    }
}