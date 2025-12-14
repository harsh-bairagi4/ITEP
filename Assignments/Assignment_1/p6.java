class Test{
    public static void main(String args[]){
        int a = 10;
        int b = 9;
        int peri = 36;
        int c = peri - a - b;
        int s = peri / 2;

        int area = s * (s-a) * (s - b) * (s - c);
        area = (int)Math.sqrt(area);

        System.out.println(area);

    }
}