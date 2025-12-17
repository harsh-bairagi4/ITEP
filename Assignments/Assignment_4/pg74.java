import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch = sc.next().trim().charAt(0);

        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}