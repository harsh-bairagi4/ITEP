import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        double breadth = sc.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);

        System.out.println("Rectangle area is: " + rectangle.getArea());
    }
}
class Rectangle{
    private double length;
    private double breadth;

    public void setLength(double length){
        this.length = length;
    }
    public void setBreadth(double breadth){
        this.breadth = breadth;
    }
    public double getArea(){
        return this.length * this.breadth;
    }
}