package Problem3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    private static final Path DATA_FILE = Path.of("Practice 5/Problem3/library.dat");

    public static void main(String[] args) {
        ArrayList<Book> books = loadBooks();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("(A)dd a book, (L)ist books, (Q)uit: ");
            String choice = scanner.nextLine().trim().toUpperCase();

            switch (choice) {
                case "A":
                    addBook(scanner, books);
                    break;
                case "L":
                    listBooks(books);
                    break;
                case "Q":
                    saveBooks(books);
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown option. Please choose A, L, or Q.");
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static ArrayList<Book> loadBooks() {
        if (!Files.exists(DATA_FILE)) {
            return new ArrayList<>();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(DATA_FILE))) {
            return (ArrayList<Book>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Could not load library.dat. Starting with an empty library.");
            return new ArrayList<>();
        }
    }

    private static void saveBooks(ArrayList<Book> books) {
        try {
            Files.createDirectories(DATA_FILE.getParent());
        } catch (IOException e) {
            System.out.println("Could not prepare the data folder.");
            return;
        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(DATA_FILE))) {
            outputStream.writeObject(books);
            System.out.println("Library saved to " + DATA_FILE + ".");
        } catch (IOException e) {
            System.out.println("Could not save library.dat.");
        }
    }

    private static void addBook(Scanner scanner, ArrayList<Book> books) {
        System.out.print("Title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Author: ");
        String author = scanner.nextLine().trim();

        books.add(new Book(title, author));
        System.out.println("Book added.");
    }

    private static void listBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            book.incrementVisitCount();
            System.out.println((i + 1) + ". " + book);
        }
    }
}
