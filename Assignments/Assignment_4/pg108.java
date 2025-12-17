import java.util.Scanner; 

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int num = sc.nextInt();
        for(int i = num; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(i == num || j == 0 || j == i - 1){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
           
            }
            System.out.println();
        }
    }
}