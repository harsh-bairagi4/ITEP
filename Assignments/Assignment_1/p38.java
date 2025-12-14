class Test{
    public static void main(String args[]){
        int volume = 1287;
        int radius = 10;
        float h = volume / (3.14f * radius * radius);
        float surface_area = 2 * 3.14f * radius * (h + radius);
        System.out.println(surface_area);
    }
}