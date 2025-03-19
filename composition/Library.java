package composition;
import java.util.ArrayList;
import java.util.Scanner;
public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
public void addBook(Book book){
    books.add(book);
}

public void displayBooks(){
    for(Book book:books){
        book.display();
    }
}
public static void main(String[] args) {
    Library lib = new Library();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of books");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Enter the title of the book");
        String title=sc.next();
        System.out.println("Enter the author of the book");
        String author=sc.next();
        System.out.println("Enter the isbn of the book");
        String isbn=sc.next();
        Book book=new Book(title, author, isbn);
        lib.addBook(book);
    }
    lib.displayBooks();
}
}