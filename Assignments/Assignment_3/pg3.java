import java.util.Scanner;

 class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        System.out.println(" Enter your service year :");
        double  serviceYear = sc.nextDouble();
        if(serviceYear<= 5)
        System.out.println("Sorry you are not eligible for bonus \nyour salary is :"+ salary);
        else
        System.out.println("Congratulation you are eligible for 5% bonus\nsalary: "+(salary*1.05));       
    }
    
}