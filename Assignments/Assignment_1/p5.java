class Test{
    public static void main(String args[]){
        int cost = 1600;
        int length = 20;
        int rate = 25;

        int perimeter = cost / rate;

        int breadth = (perimeter / 2) - length;

        int area = length * breadth;

        System.out.println(breadth);
        System.out.println(perimeter);
        System.out.println(area);
    }
}