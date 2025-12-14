class Test{
    public static void main(String args[]){
        int diagonal = 46;
        int side1 = 13;
        int side2 = 10;

        int area1 = (side1 * diagonal)/2;
        int area2 = (side2 * diagonal)/2;

        int totalArea = area1 + area2;
        System.out.println(totalArea);
    }
}