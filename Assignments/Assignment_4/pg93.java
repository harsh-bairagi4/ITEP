import java.util.Scanner; 

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int num = sc.nextInt();
       char ch = 'a';
        for(int i = 1; i <= num; i++){
            
            for(int j = 1; j <= i; j++){
                if(i == num){
                    System.out.print(ch);
                }
                else if(j == 1 || j == i){
                    System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
                ch++;
            }
            System.out.println();
        }
    }
}