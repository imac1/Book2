public class BookChecking {

    public boolean bookCheck(Book b1, Book b2) {

        if (b1.title.equalsIgnoreCase(b2.title)) {
            return true;
        } else
            return false;

    }

    public boolean thicknessCheck (Book b1, Book b2){
        if (b1.pagesNumber > b2.pagesNumber){
          return true;
        } else
            return false;
    }

}
