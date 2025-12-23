import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle();
        circle.setRadius(radius);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
class Circle{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius;
    }
    public double getCircumference(){
        return 2 * 3.14 * this.radius;
    }
}