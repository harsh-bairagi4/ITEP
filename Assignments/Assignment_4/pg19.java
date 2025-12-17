// print only N number of Even number

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
    
    int count = 0;
    int i=1;
    while(i<= n){
      if(i%2 == 0){
        System.out.println(i);
        count++;
      }
      i++;
    }
    System.out.println("Total count : "+count);
  }
}