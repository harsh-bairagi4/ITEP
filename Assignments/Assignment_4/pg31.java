import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner  sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int count = 0;
    int i = 1;
    while(count < n){
        int square = i*i;
        System.out.println(i +" = " +square );
        count++;
        i++;
    }

  }
}