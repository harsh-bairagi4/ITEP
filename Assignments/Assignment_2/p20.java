import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of brick: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of brick: ");
        int breadth = sc.nextInt();
        System.out.println("Enter the height of brick: ");
        int height = sc.nextInt();

        int volume = length * breadth * height;
        System.out.println("Volume of brick: "+ volume);
    }
}