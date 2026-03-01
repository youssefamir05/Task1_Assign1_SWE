import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        boolean anyAvailable = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle());
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No books are available at the moment");
        }
    }
}