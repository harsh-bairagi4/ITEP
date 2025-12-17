
//18 problem
import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the num : ");
    int n = sc.nextInt();
    int pre = 1;
    int i=1;
    while(i <= n){
      int curr = i;
      int next  = curr*pre;
       pre = next;
      System.out.println(next);
      i =i+pre;
    }
  }
}