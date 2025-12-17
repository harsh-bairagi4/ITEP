import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the any number 1 to 26 : ");
    int n = sc.nextInt();
    int count = 0;
    int i = 65;
    while(count <= n){
          
          if(i % 2 == 0){
           System.out.println((char)(i + 32));
          }
          else{
            System.out.println((char)i);
          }
          count++;
          i++;
    }
  }
}