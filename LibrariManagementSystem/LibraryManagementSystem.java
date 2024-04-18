import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor OF BOOK object
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }


    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class User {
    private int id;
    private String firstName;
    private String lastName;
    private String studentId;
    private String email;

    // Constructor to initialize a User DETAILS
    public User(int id, String firstName, String lastName, String studentId, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }
}

class BorrowingRecord {
    private Book book;
    private User user;
    private String borrowDate;

    // Constructor to initialize a BorrowingRecord
    public BorrowingRecord(Book book, User user, String borrowDate) {
        this.book = book;
        this.user = user;
        this.borrowDate = borrowDate;
    }


    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
}

class Library {
    private List<Book> books;
    private List<User> users;
    private List<BorrowingRecord> borrowingRecords;

    // Constructor to initialize a Library object
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        borrowingRecords = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }

    // Method to add a user to the library
    public void addUser(User user) {
        users.add(user);
    }

    // Method to borrow a book from the library
    public void borrowBook(Book book, User user, String borrowDate) {
        if (!book.isAvailable()) {
            System.out.println("Sorry, the book is not available for borrowing.");
            return;
        }

        book.setAvailable(false);
        borrowingRecords.add(new BorrowingRecord(book, user, borrowDate));
        System.out.println("Book '" + book.getTitle() + "' is successfully borrowed by " +
                user.getFirstName() + " " + user.getLastName() + ".");
    }

    // Method to return a book to the library
    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("Book '" + book.getTitle() + "' is successfully returned.");
    }

    // Method to display available and unavailable books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        List<Book> availableBooks = new ArrayList<>();
        List<Book> unavailableBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            } else {
                unavailableBooks.add(book);
            }
        }

        System.out.println("Available Books:");
        for (Book book : availableBooks) {
            System.out.println("ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor());
        }

        System.out.println("\nUnavailable Books:");
        for (Book book : unavailableBooks) {
            System.out.println("ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor());
        }
    }

    // Method to display registered users in the library
    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No registered users.");
            return;
        }

        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getFirstName() + " " +
                    user.getLastName() + ", Student ID: " + user.getStudentId() +
                    ", Email: " + user.getEmail());
        }
    }

    // Getters for the Library class
    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System");

        Scanner scanner = new Scanner(System.in);

        // User registration
        System.out.print("Enter Your First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Your Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Your Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Your Email Address (e.g., example@gmail.com): ");
        String email = scanner.nextLine();


        User currentUser = new User(1, firstName, lastName, studentId, email);


        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("1", "Effective Java", "Joshua Bloch"));
        library.addBook(new Book("2", "C# in Depth", "Jon Skeet"));
        library.addBook(new Book("3", "1984", "George Orwell"));
        library.addBook(new Book("4", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("5", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("6", "Pride and Prejudice", "Jane Austen"));


        library.addUser(currentUser);


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check For Books");
            System.out.println("2. Display Registered Users");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    library.displayBooks();
                    break;
                case "2":
                    library.displayUsers();
                    break;
                case "3":
                    // Borrow a book
                    System.out.print("Enter the ISBN of the book you want to borrow: ");
                    String isbnToBorrow = scanner.nextLine();
                    Book bookToBorrow = library.getBooks().stream()
                            .filter(book -> book.getIsbn().equals(isbnToBorrow))
                            .findFirst()
                            .orElse(null);
                    if (bookToBorrow != null)
                        library.borrowBook(bookToBorrow, currentUser, getCurrentDate());
                    else
                        System.out.println("Invalid book ISBN.");
                    break;
                case "4":
                    // Return a book
                    System.out.print("Enter the ISBN of the book you want to return: ");
                    String isbnToReturn = scanner.nextLine();
                    Book bookToReturn = library.getBooks().stream()
                            .filter(book -> book.getIsbn().equals(isbnToReturn))
                            .findFirst()
                            .orElse(null);
                    if (bookToReturn != null)
                        library.returnBook(bookToReturn);
                    else
                        System.out.println("Invalid book ISBN.");
                    break;
                case "5":
                    // Exit the program
                    System.out.println("Exiting Library Management System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }


    public static String getCurrentDate() {

        return "2022-04-13";
    }
}
