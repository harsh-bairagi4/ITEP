import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        int num = 1;
        for(int i = 0; i < n ; i++){
            System.out.println(num);
            if(i % 2 == 0){
                num = num * 10;
            }
            else{
                num = num * 10 + 1;
            }
            
        }
    }
}