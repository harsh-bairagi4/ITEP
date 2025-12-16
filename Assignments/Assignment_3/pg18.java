import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int sub = sc.nextInt();
        System.out.print("Enter the sum of all subjects: ");
        double sum = sc.nextDouble();

        double percentage = sum / sub;
        System.out.print("The percentage are: " + percentage);
    }
}