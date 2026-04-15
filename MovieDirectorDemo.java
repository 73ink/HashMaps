import java.util.HashMap;

public class MovieDirectorDemo {
    public static void main(String[] args) {

        // create HashMap for movie and director
        HashMap<String, String> movies = new HashMap<String, String>();

        // add movie-director records
        movies.put("Inception", "Christopher Nolan");
        movies.put("Titanic", "James Cameron");
        movies.put("Avatar", "James Cameron");
        movies.put("Jaws", "Steven Spielberg");
        movies.put("Gladiator", "Ridley Scott");

        // display all records
        System.out.println("Movie directors:");
        System.out.println(movies);

        // get director of one movie
        System.out.println("Director of Inception: " + movies.get("Inception"));

        // check existing movie
        System.out.println("Does Titanic exist? " + movies.containsKey("Titanic"));

        // check non-existing movie
        System.out.println("Does Frozen exist? " + movies.containsKey("Frozen"));

        // update one director
        movies.put("Gladiator", "Scott");
        System.out.println("After updating Gladiator director:");
        System.out.println(movies);

        // remove one movie
        movies.remove("Jaws");
        System.out.println("After removing Jaws:");
        System.out.println(movies);

        // display size
        System.out.println("Total records left: " + movies.size());
    }
}