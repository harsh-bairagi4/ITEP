import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of shelly garden: ");
        int l1 = sc.nextInt();
        System.out.println("Enter the breadth of shelly garden: ");
        int b1 = sc.nextInt();
        int areaShelly = l1 * b1;
        System.out.println("Enter the side of rachel garden: ");
        int a = sc.nextInt();
        int areaRachel = a * a;

        System.out.println(areaShelly);
        System.out.println(areaRachel);
    }
}