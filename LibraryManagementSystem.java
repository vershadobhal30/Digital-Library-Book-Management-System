import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nDigital Library Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID or Title");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete a Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability (Available/Checked Out): ");
                    String status = scanner.nextLine();
                    library.addBook(id, title, author, genre, status);
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID or Title: ");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                    break;
                case 4:
                    System.out.print("Enter Book ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Title (or press Enter to skip): ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new Author (or press Enter to skip): ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter new Status (Available/Checked Out): ");
                    String newStatus = scanner.nextLine();
                    library.updateBook(updateId, newTitle, newAuthor, newStatus);
                    break;
                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = scanner.nextInt();
                    library.deleteBook(deleteId);
                    break;
                case 6:
                    System.out.println("Exiting System...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
