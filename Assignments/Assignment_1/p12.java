class Test{
    public static void main(String args[]){
        int hypotenuse = 13;
        int base = 12;
        int height = (int) Math.sqrt(hypotenuse * hypotenuse - base * base);
        int area = (base * height) / 2;
        System.out.println(height);
        System.out.println(area);
    }
}