import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int num = sc.nextInt();
        char ch = 'A';
        for(int i = 0; i < num; i++){
            for(int j = 1; j <= i * 2 + 1; j++){
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();
        }
    }
}