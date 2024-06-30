import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class LmsManagement {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static Book fillBook(){

        Book book = new Book();
        scanner.nextLine();
        System.out.println("Please enter the name of the book: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.println("Please enter the janr of the book: ");
        String janr = scanner.nextLine();
        System.out.println("Please enter the number of the page: ");
        String numberOfPage = scanner.nextLine();
        System.out.println("Please enter the language of the book: ");
        String language = scanner.nextLine();
        System.out.println("Please enter the price of the book: ");
        String price = scanner.nextLine();
        System.out.println("Please enter the number of the book: ");
        String numberOfBooks = scanner.nextLine();


        book.setName(name);
        book.setAuthor(author);
        book.setJanr(janr);
        book.setNumberOfPage(numberOfPage);
        book.setLanguage(language);
        book.setPrice(price);
        book.setNumberOfBooks(numberOfBooks);

        return book;

    }

    public static void registerBooks(){

        System.out.println("How many books would you like to register?");
        int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                System.out.println(i + 1 + "st book:");
                books.add(fillBook());
                System.out.println("Register succesfull!");
            }

        }

        public static void showAllBooks(){

        for (Book book : books) {
            System.out.println(book);
        }
        }

        public static void findByname(){
        scanner.nextLine();
        System.out.println("Enter the name of the book to find: ");
        String name = scanner.nextLine();
        Book foundBook = null;
        for (Book book : books) {
            if (book.getName().equals(name)) {
                foundBook = book;
                break;
            }
        }
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getName() + "by " + foundBook.getAuthor());
        }else {
            System.out.println("Book not found");


        }

        }

        public static void updateBook(){
        scanner.nextLine();
            System.out.println("Enter the name of the book to update: ");
            String name = scanner.nextLine();
            Book foundBook = null;
            for (Book book : books) {
                if (book.getName().equals(name)) {
                    foundBook = book;
                    break;
                }
            }
            if (foundBook != null) {
                System.out.println("Enter new details for the book: ");
                foundBook = fillBook();
                books.set(books.indexOf(foundBook), foundBook);
                System.out.println("Book updated!");
            }else {
                System.out.println("Book not found");
            }
        }

        public static void deleteBook(){
        scanner.nextLine();
        System.out.println("Enter the name of the book to delete: ");
        String name = scanner.nextLine();
        Book foundBook = null;
        for (Book book : books) {
            if (book.getName().equals(name)) {
                foundBook = book;
                break;
            }
        }
        if (foundBook != null) {
            books.remove(foundBook);
            System.out.println("Book deleted!");
        }else {
            System.out.println("Book not found");
        }
        }

        }


