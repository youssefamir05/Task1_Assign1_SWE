import java.util.ArrayList;

public class Member {

    private int id;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
        }else {
            System.out.println("You can not borrow the book at the moment");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.println("Book was not borrowed");
        }
    }

    public void viewBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books");
        } else {
            System.out.println("Your borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}