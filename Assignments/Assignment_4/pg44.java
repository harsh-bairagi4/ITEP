import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
 
   System.out.println("Enter number : ");
   int n = sc.nextInt();
   int sum = 0;
   int i = 1;
   while( i <= n){
    if(n%i == 0 && i<n){
      sum += i;
    }
    if(sum == n){
      System.out.println(sum + " It is perfect number");
      break;
    }
     i++;
   }
  }
}