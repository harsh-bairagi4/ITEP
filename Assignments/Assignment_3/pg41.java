import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
        double phy = sc.nextDouble();
        double chem = sc.nextDouble();
        double bio = sc.nextDouble();
        double math = sc.nextDouble();
        double comp = sc.nextDouble();

        double total = phy + chem + bio + math + comp;
        double percent = total / 5.0;

        System.out.println("Percentage = "+ percent + " %");

        if(percent >=90)
        System.out.println("Grade A");
        else if(percent >= 80)
        System.out.println("Grade B");
        else if(percent >= 70)
        System.out.println("Grade C");
        else if(percent >= 60)
        System.out.println("Grade D");
        else if(percent >= 40)
        System.out.println("Grade E");
        else
        System.out.println("Grade F");
    }
}