package bookmangmentpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>(); 
        
        System.out.println("Welcome to Book Management System!");

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1: Add a Book");
            System.out.println("2: View Book Information");
            System.out.println("3: Exit");

            int userChoice = in.nextInt();
            in.nextLine(); 

            switch (userChoice) {
                case 1: 
                    Book book = new Book();
                    System.out.println("Please enter the name of the book:");
                    String bookName = in.nextLine();
                    book.setNameOfBook(bookName);

                    System.out.println("Please enter the name of the author:");
                    String authorName = in.nextLine();
                    book.setNameOfAuthor(authorName);

                    System.out.println("Please enter the year of publication:");
                    int publicationYear = in.nextInt();
                    book.setYearOfpublication(publicationYear);

                    books.add(book); 
                    System.out.println("Book added successfully!");
                    break;

                case 2: 
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nInformation about your books:");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ". " + books.get(i).toString());
                        }
                    }
                    break;

                case 3: 
                    System.out.println("Exiting the system. Goodbye!");
                    in.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }
}
