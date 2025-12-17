import java.util.Scanner ;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    int i = 1;
    int sum = 0;
    while(num != 0){
      i *= 10;
      i++;
      sum += i;
      num--;
    }
    System.out.print(sum);
  } 
}