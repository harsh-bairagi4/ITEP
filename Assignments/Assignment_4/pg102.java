import java.util.Scanner;

class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of lines: ");
    int n = sc.nextInt();
    for(int i = n; i > 0; i--){
        for(int j = 0; j < i; j++){
            System.out.print(i);
        }
        System.out.println();
    }
    }
   
}