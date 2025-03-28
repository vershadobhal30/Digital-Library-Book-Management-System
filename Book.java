class Book {
    private int bookId;         // Unique book ID 
    private String title;       // Book Title (non-empty)
    private String author;      // Author (non-empty)
    private String genre;       // Book Genre
    private String status;      // Availability Status (Available / Checked Out)

    // Constructor to initialize book details
    public Book(int bookId, String title, String author, String genre, String status) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    // Getter methods for accessing book properties
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public String getStatus() {
        return status;
    }
    
    // Setter methods
    public void setStatus(String status) {
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details in a readable format
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Status: " + status;
    }

}
