import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for(int j = 1; j <= i * 2 + 1; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}