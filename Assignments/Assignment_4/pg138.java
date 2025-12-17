import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r= sc.nextInt();
        int c=2*r-1;
        for(int i = 0; i < r; i++){
        
            for(int j = 0; j < c; j++){
                if(j==c/2)
                {
                    System.out.print("#");
                }
                else if(j>=c/2-i && j<=c/2+i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();        }
    }
}