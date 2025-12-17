import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int i = 90;
    while(i >= 65){
      char ch = (char)i;
      System.out.println(ch);
      i--;
    }
  }
}
