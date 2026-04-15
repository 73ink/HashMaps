import java.util.HashMap;

public class BookAuthorDemo {
    public static void main(String[] args) {

        // create HashMap for book title and author
        HashMap<String, String> books = new HashMap<String, String>();

        // add book-author records
        books.put("Hamlet", "Shakespeare");
        books.put("1984", "George Orwell");
        books.put("The Hobbit", "J.R.R. Tolkien");
        books.put("Moby Dick", "Herman Melville");
        books.put("Pride and Prejudice", "Jane Austen");

        // display all records
        System.out.println("Book authors:");
        System.out.println(books);

        // get author of one book
        System.out.println("Author of 1984: " + books.get("1984"));

        // check if one book exists
        System.out.println("Does Hamlet exist? " + books.containsKey("Hamlet"));

        // update one author
        books.put("Moby Dick", "Melville");
        System.out.println("After updating author of Moby Dick:");
        System.out.println(books);

        // remove one record
        books.remove("The Hobbit");
        System.out.println("After removing The Hobbit:");
        System.out.println(books);

        // display size
        System.out.println("Total records left: " + books.size());
    }
}