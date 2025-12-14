class Test{
    public static void main(String args[]){
        int length = 15;
        int breadth = 8;
        int height = 5;

        int b_volume = length * breadth * height;
        int wall_length = 15 * 100;
        int wall_breadth = 10 * 100;
        int wall_height = 8 * 100;

        int wall_volume = wall_length * wall_breadth * wall_height;

        int total_brick = wall_volume/b_volume;
        System.out.println(total_brick);
    }
}