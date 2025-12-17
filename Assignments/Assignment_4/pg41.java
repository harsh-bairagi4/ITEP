import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
     System.out.println("Enter the number: ");
    int num = sc.nextInt();
    int i = 1;
    while(num != 0){
      System.out.println(i*9);
      i *= 10;
      i++;
      num--;
    }
  }
}