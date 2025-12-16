import java.util.Scanner;

class pg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        char grade = 'x';
'
'
        double marks = sc.nextInt();
        if(marks <= 100 && marks>0)
        {   if (marks<=25)
            grade = 'F';
            else if(marks >25 && marks <=45)
            grade = 'E';
            else if(marks >45 && marks <=50)
            grade = 'D';
             else if(marks >50 && marks <=60)
            grade = 'C';
            else if(marks >60 && marks <= 80)
            grade = 'B';
            else
            grade = 'A';

            System.out.println("your grade is : "+ grade);
        }
        else 
            System.out.println("you have entered wrong marks : ");


    }
}
