public class Book {

    String title;
    String author;
    String publisher;
    int pagesNumber;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title.toUpperCase() + '\'' +
                ", author='" + author.toLowerCase() + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pagesNumber=" + pagesNumber +
                '}';
    }
}
