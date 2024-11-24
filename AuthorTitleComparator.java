import java.util.Comparator;

class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int authorComparison = b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
        if (authorComparison == 0) {
            return b1.getTitle().compareToIgnoreCase(b2.getTitle());
        }
        return authorComparison;
    }
}
