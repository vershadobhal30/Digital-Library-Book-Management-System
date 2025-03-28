Digital Library Book Management System

Overview :

This project is a Java-based Digital Library Management System that allows librarians to add, view, update, search, and remove books efficiently while maintaining availability status.
This system follows object-oriented principles and includes proper **data validation** and **exception handling** to ensure reliability.

Features :

- Add a Book : Accepts Book ID, Title, Author, Genre, and Availability Status.
- View All Books : Displays a list of all books with their details.
- Search Book by ID or Title : Allows users to search for a book using its ID or Title.
- Update Book Details : Modify book details such as title, author, or availability status.
- Delete a Book Record : Removes a book from the catalog.
- Exit System : Closes the program.

*****

Tech Stack :
- Java : (Core Java, Collections)
- IDE : Any Java-supported IDE (VS Code, IntelliJ IDEA, Eclipse)
- I have used VS Code for this Project.
- Version Control : Git & GitHub


*****


Setup and run Instructions :

** Step 1: Clone the Repository 

To get a local copy of the project, open **Terminal (Mac/Linux) or Command Prompt (Windows)** and run:

bash
git clone https://github.com/YourUsername/YourRepositoryName.git

Replace YourUsername and YourRepositoryName with your actual GitHub username and repository name.


** Step 2: Navigate to the Project Folder

bash
cd YourRepositoryName


** Step 3: Compile the Java Files

bash
javac Book.java Library.java LibraryManagementSystem.java

             OR

You can run directly your main Java file example -( javac LibraryManagementSystem.java)


** Step 4: Run the Main Program (LibraryManagementSystem.java is the entry point)

bash
java LibraryManagementSystem


*****


Once you run the program, it will start prompting for input based on your menu. Example:

Welcome to the Digital Library!
1. Add Book
2. View All Books
3. Search Book
4. Update Book
5. Delete Book
6. Exit

Enter your choice: 1
Enter Book ID: 101
Enter Title: Java Basics
Enter Author: John Doe
Enter Genre: Programming
Enter Status (Available/Checked Out): Available
Book added successfully!


******


Reflection on Challenges Faced During Development & Possible Improvements :

	•	Ensuring proper input validation for book details.
	•	Handling exceptions when updating or deleting non-existing books.
	•	Maintaining clean and modular code for better readability.

Future Improvements
	•	Implement a Graphical User Interface (GUI).
	•	Store book data in a database instead of an in-memory collection.
	•	Add user authentication for librarians.
	•	Introduce a book borrowing system with due dates.


******



             
