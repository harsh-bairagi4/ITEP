class Test{
    public static void main(String args[]){
        float b_len = 25f/100;
        float b_wid = 10f/100;
        float b_thick = 7.5f/100;

        int wall_length = 20;
        int wall_height = 2;
        float wall_thick = 0.75f;

        double volume_brick = b_len * b_wid * b_thick;

        double volume_wall = wall_length * wall_height * wall_thick;

        double num_bricks = volume_wall/volume_brick;
        System.out.println(num_bricks);
        double cost = (num_bricks/1000) * 900;
        System.out.println(cost);

    }
}