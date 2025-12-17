import java.util.Scanner; 

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                if(i == num - 1 || j == 0 || j == i){
                    System.out.print("*");
                }
            
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}