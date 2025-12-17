import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int original = num;
        int res = 0;

        while(num>0){
            int rem = (num%10);
            res = res * 10 + rem;
            num /= 10;
        }
        if(original== res){
            System.out.println("This is palindrome");
        } else{
            System.out.println("This is not palindrome");
        }
        
    }
}