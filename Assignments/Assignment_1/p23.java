class Test{
    public static void main(String args[]){
        int vol_carton = 15 * 9 * 12;
        int vol_cube = 3 * 3 * 3;

        int boxes = vol_carton / vol_cube;
        System.out.println(boxes);
    }
}