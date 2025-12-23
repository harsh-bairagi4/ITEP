import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of movie: ");
        String name = sc.nextLine();
        System.out.println("Enter the genre of movie: ");
        String genre = sc.nextLine();
        System.out.println("Enter the rating of movie: ");
        float rating = sc.nextFloat();

        MovieSystem movie1 = new MovieSystem();
        movie1.setName(name);
        movie1.setGenre(genre);
        movie1.setRating(rating);

        System.out.println("Movie name: " + movie1.getName());
        System.out.println("Movie genre: " + movie1.getGenre());
        System.out.println("Movie rating: " + movie1.getRating());
        System.out.println("Hit: " + movie1.isHit());
    }
}
class MovieSystem{
    private String name;
    private String genre;
    private float rating;

    public void setName(String name){
        this.name = name;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setRating(float rating){
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }
    public String getGenre(){
        return this.genre;
    }
    public float getRating(){
        return this.rating;
    }
    public boolean isHit(){
        return this.rating >= 8.0f;
    }
}