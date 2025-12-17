import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number  = ");

    int n = sc.nextInt();
    int i = 1;
    while( i <= n){
      if(i%5 == 0){
        System.out.println("Hello");
      }else{
        System.out.println(i);
      }
      i++;
    }
  }
}