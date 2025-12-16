import java.util.Scanner; 

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(number == 1){
            System.out.println("one");
        }
        else if(number == 2){
            System.out.println("two");
        }
        else if(number == 3){
            System.out.println("three");
        }
        else if(number == 4){
            System.out.println("four");
        }
        else if(number == 5){
            System.out.println("five");
        }
        else{
            System.out.println("You can write numbers only in between 1 to 5");
        }
    }
}