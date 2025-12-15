import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ")
        int length = sc.nextInt();

        System.out.println("Enter the width");
        int wide = sc.nextInt();

        System.out.println("Enter the deep");
        int deep = sc.nextInt();

        int capacity = length * wide * deep;

        System.out.println("The capacity is " + capacity);
    }
}