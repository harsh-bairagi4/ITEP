import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        int ch = 1;
        for(int i = 0 ; i < n; i++){
           if(i%2 == 0)
                ch = 0;
            for(int j = 0; j <= i; j++){
                ch = (ch == 0) ? 1 : 0;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}