import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class list {

    private String title;
    private String director;
    private List<String> cast;
    private int year;
    private float price;


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public list(String s1, String s2, List<String> list, int i1, float i2) {

        title = s1;
        director = s2;
        cast = list;
        year = i1;
        price = i2;
    }

    public String toString() {
        return "The movie " + title + " is directed by " + director + ", and stars " + cast +
                ". It was released in " + year + ", and has a price of " + price + " per ticket.";
    }

    static list knivesOut = new list("Knives Out", "Rian Johnson",
            Arrays.asList("Daniel Craig", "Chris Evans", "Ana de Armas"), 2019, 4.99f);

    static list tenet = new list("Tenet", "Christopher Nolan",
            Arrays.asList("John David Washington", "Robert Pattinson", "Elizabeth Debicki"), 2020, 6.99f);

    static list joker = new list("Joker", "Todd Phillips",
            Arrays.asList("Joaquin Phoenix", "Robert De Niro", "Zazie Beetz"), 2019, 3.99f);

    public static void main(String[] args) {

        List<list> movies = new ArrayList<>();
        movies.add(knivesOut);
        movies.add(tenet);
        movies.add(joker);

            for(int i = 0; i < movies.size(); i++) {
                System.out.println("---------------------------------");
                System.out.println(i+1 + ". " + movies.get(i).toString());
            }

            System.out.println("Please choose the movie you'd like to view.");

            Scanner userChoice = new Scanner(System.in);
            int movieChoice = userChoice.nextInt();

            System.out.println("Your choice is: " + movies.get(movieChoice-1).toString());
            System.out.println("Is that correct?");

            System.out.println("1. Yes");
            System.out.println("2. No");

            int rightWrong = userChoice.nextInt();

                while(rightWrong == 2){
                    System.out.println("Please choose the movie you'd like to view.");
                    movieChoice = userChoice.nextInt();

                    System.out.println("Your choice is: " + movies.get(movieChoice-1).toString());
                    System.out.println("Is that correct?");

                    System.out.println("1. Yes");
                    System.out.println("2. No");

                    rightWrong = userChoice.nextInt();
                }

            int chosen = movieChoice;

    }
}
