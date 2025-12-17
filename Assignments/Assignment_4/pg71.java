import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().trim().charAt(0);
        for(int i = 0; i < 5; i++){
            System.out.print(ch);
        }
    }
}