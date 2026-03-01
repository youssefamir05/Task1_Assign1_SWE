import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Menu : ");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Available Books");
            System.out.println("6. View Member Borrowed Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    library.addBook(new Book(bookId, title));
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    library.addMember(new Member(memberId, name));
                    break;

                case 3:
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextInt();
                    scanner.nextLine();

                    Member member = library.findMemberById(memberId);
                    Book book = library.findBookById(bookId);

                    if (member != null && book != null) {
                        member.borrowBook(book);
                    } else {
                        System.out.println("Invalid Member ID or Book ID");
                    }
                    break;

                case 4:
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextInt();
                    scanner.nextLine();

                    member = library.findMemberById(memberId);
                    book = library.findBookById(bookId);

                    if (member != null && book != null) {
                        member.returnBook(book);
                    } else {
                        System.out.println("Invalid Member ID or Book ID");
                    }
                    break;

                case 5:
                    library.displayAvailableBooks();
                    break;

                case 6:
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextInt();
                    scanner.nextLine();
                    member = library.findMemberById(memberId);
                    if (member != null) {
                        member.viewBorrowedBooks();
                    } else {
                        System.out.println("Invalid Member ID");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}