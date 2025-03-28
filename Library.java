import java.util.*;

class Library {
    private Map<Integer, Book> books;  // Store books with Book ID as key

    public Library() {
        books = new HashMap<>();  // Initialize book storage
    }

    // Method to add a book
    public void addBook(int bookId, String title, String author, String genre, String status) {
        if (books.containsKey(bookId)) {  // Check if Book ID is unique
            System.out.println("Book ID already exists! Choose a different ID.");
            return;
        }

        if (title.isEmpty() || author.isEmpty()) {  // Validate input
            System.out.println("Title and Author cannot be empty.");
            return;
        }

        if (!status.equalsIgnoreCase("Available") && !status.equalsIgnoreCase("Checked Out")) {
            System.out.println("Invalid status! Use 'Available' or 'Checked Out'.");
            return;
        }

        Book newBook = new Book(bookId, title, author, genre, status);
        books.put(bookId, newBook);  // Store book in collection
        System.out.println("Book added successfully!");
    }

    // Method to view all books
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("Library Books:");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    // Method to search book by ID or Title
    public void searchBook(String keyword) {
        for (Book book : books.values()) {
            if (String.valueOf(book.getBookId()).equals(keyword) || book.getTitle().equalsIgnoreCase(keyword)) {
                System.out.println("Book Found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Method to update book details
    public void updateBook(int bookId, String newTitle, String newAuthor, String newStatus) {
        if (!books.containsKey(bookId)) {
            System.out.println("Book ID not found!");
            return;
        }

        Book book = books.get(bookId);

        if (!newTitle.isEmpty()) {
            book.setTitle(newTitle);
        }
        if (!newAuthor.isEmpty()) {
            book.setAuthor(newAuthor);
        }
        if (newStatus.equalsIgnoreCase("Available") || newStatus.equalsIgnoreCase("Checked Out")) {
            book.setStatus(newStatus);
        } else {
            System.out.println("Invalid status format! Use 'Available' or 'Checked Out'.");
        }

        System.out.println("Book details updated successfully!");
    }

    // Method to delete a book
    public void deleteBook(int bookId) {
        if (!books.containsKey(bookId)) {
            System.out.println("Book ID not found.");
            return;
        }

        books.remove(bookId);
        System.out.println("Book deleted successfully.");
    }
}