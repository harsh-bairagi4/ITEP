import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = 1;
        while(num != 0){
            ans *= num;
            num--;
        }
        System.out.println(ans);
    }
}