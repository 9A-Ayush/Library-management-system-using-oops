public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        library.showBooks();

        library.issueBook("1984");
        library.returnBook("1984");

        library.showBooks();
    }
}
