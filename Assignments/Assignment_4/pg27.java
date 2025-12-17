import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int  second = 1;
    int i = 0;
    while(i <= n){
      int next = i+second;
      second = next;
      System.out.println(next);
      i++;
    }
  }
}