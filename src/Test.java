import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Book book1 = new Book();
        System.out.println("Enter title");
        book1.title = s.nextLine();
        System.out.println("Enter author");
        book1.author = s.nextLine();
        System.out.println("Enter publisher");
        book1.publisher = s.nextLine();

        int numberOfPages = 0;

        do {
            System.out.println("Enter number of pages");
            numberOfPages = s.nextInt();
        } while (numberOfPages == 0);

        book1.pagesNumber = numberOfPages;
        System.out.println(book1);

        Book book2 = new Book();

        System.out.println("Enter title");
        book2.title = s.next();
        System.out.println("Enter author");
        book2.author = s.next();
        System.out.println("Enter publisher");
        book2.publisher = s.next();

        do {
            System.out.println("Enter number of pages");
            numberOfPages = s.nextInt();
        } while (numberOfPages == 0);

        book2.pagesNumber = numberOfPages;
        System.out.println(book2);

        BookChecking bookChecking = new BookChecking();

        if (bookChecking.bookCheck(book1, book2)) {
            System.out.println("you have 2 books with the same title");
        } else
            System.out.println("Congratulations, your book is unique!");

        BookChecking thicknessCheck = new BookChecking();

        if (thicknessCheck.thicknessCheck(book1,book2)){
            System.out.println( book1.title + " is thicker than " + book2.title);
        }

    }



}
