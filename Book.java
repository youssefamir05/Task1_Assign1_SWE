public class Book {

    private int id;
    private String title;
    private boolean isAvailable;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable =false ;
            System.out.println("You borrowed the book successfully");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book is returned successfully");
        }
    }
}