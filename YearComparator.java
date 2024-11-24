import java.util.Comparator;

class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b2.getYear(), b1.getYear()); // Newer books first
    }
}
