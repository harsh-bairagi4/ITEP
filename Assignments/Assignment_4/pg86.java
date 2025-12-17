import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int num = sc.nextInt();
        char ch = 'a';
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();
        }
    }
}