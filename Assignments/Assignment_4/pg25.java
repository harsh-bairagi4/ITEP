import java.util.Scanner;
class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     int i = 97;
     while(i <= 122){
       char ch = (char)i;
       System.out.println(ch);
       i++;
     }
  }
}