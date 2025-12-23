import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String name = sc.nextLine();
        System.out.println("Enter the marks of maths: ");
        float mathMarks = sc.nextFloat();
        System.out.println("Enter the marks of science: ");
        float scienceMarks = sc.nextFloat();

        Student student1 = new Student();
        student1.setName(name);
        student1.setMathMarks(mathMarks);
        student1.setScienceMarks(scienceMarks);

        System.out.println("Name: "+ student1.getName());
        System.out.println("Math marks: "+ student1.getMathMarks());
        System.out.println("Science marks: "+ student1.getScienceMarks());
        System.out.println("Average marks: " + student1.getAverage());
    }
}
class Student{
    private String name;
    private float mathMarks;
    private float scienceMarks;

    public void setName(String name){
        this.name = name;
    }
    public void setMathMarks(float mathMarks){
        this.mathMarks = mathMarks;
    }
    public void setScienceMarks(float scienceMarks){
        this.scienceMarks = scienceMarks;
    }

    public String getName(){
        return this.name;
    }
    public float getMathMarks(){
        return this.mathMarks;
    }
    public float getScienceMarks(){
        return this.scienceMarks;
    }
    public float getAverage(){
        return (this.mathMarks + this.scienceMarks ) / 2;
    }
}