import java.util.Scanner;
class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter number : ");
     int n = sc.nextInt();

     int i = 1;
     int first = 0, second = 1;
     while(i <= n){
        System.out.println(first);
        int next = first + second;
        first = second;
        second = next;
     i++;
     }
  }
}