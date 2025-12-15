import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangular: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangular: ");
        int breadth = sc.nextInt();
        int perimeter = 2 * (length + breadth);
        int totalRounds = 10 * perimeter;

        System.out.println(totalRounds);
    }
}