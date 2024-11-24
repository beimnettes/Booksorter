import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));
        books.add(new Book("Animal Farm", "George Orwell", 1945));

        System.out.println("Original List:");
        books.forEach(System.out::println);

        System.out.println("\nSorted by Title:");
        Collections.sort(books);
        books.forEach(System.out::println);

        System.out.println("\nSorted by Author:");
        books.sort(new AuthorComparator());
        books.forEach(System.out::println);

        System.out.println("\nSorted by Year (Newest First):");
        books.sort(new YearComparator());
        books.forEach(System.out::println);

        System.out.println("\nSorted by Author, then Title:");
        books.sort(new AuthorTitleComparator());
        books.forEach(System.out::println);
    }
}
