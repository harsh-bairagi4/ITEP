import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of book");
        String title = sc.nextLine();
        System.out.println("Enter the author of book");
        String author = sc.nextLine();
        System.out.println("Enter the price of book");
        int price = sc.nextInt();

        Book book1 = new Book();
        book1.setTitle(title);
        book1.setAuthor(author);
        book1.setPrice(price);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());

    }
}

class Book{
    private String title;
    private String author;
    private int price;

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPrice(){
        return this.price;
    }
}