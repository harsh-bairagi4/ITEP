import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }
        else{
            int i = 2;
            while( i*i <= num){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        if(isPrime){
            System.out.println(num + " is a Prime Number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}