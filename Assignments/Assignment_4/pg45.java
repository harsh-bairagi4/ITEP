import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int count = 0;
  
    while(n > 0){
      n = n/10;
      count++;
    }
    System.out.println("total digit : "+ count);
    }
}