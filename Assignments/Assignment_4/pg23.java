import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the N number : ");
    int n = sc.nextInt();
    int i = n;
    while( i >= 1){
      System.out.println(i);
      i--;
    }
  }
}