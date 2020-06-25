package HomeworkSix;

import java.util.Iterator;
import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        Book book1 = new Book("Original", "Den Brown", 2017);
        Book book2 = new Book("Witcher", "Andjei Sapkovskyi", 2010);
        Book book3 = new Book("Game of Thrones", "George R.R. Martin", 2005);
        Book book4 = new Book("Blood with milk", "Lyuko Dashwar", 2007);

        LinkedList<Book> bookShelf = new LinkedList<>();
        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);

        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()){
            it.next().bookInfo();
        }
        System.out.println("-----------------------------Added a new book and sorted the list.");
        bookShelf.add(2, new Book("Veronika decide morrer", "Paulo Coelh", 2002));

        bookShelf.sort(Book::compareTo);
        Iterator<Book> it1 = bookShelf.iterator();
        while(it1.hasNext()){
            System.out.println( it1.next().getTitle());

        }
        System.out.println("-------------------------Removed one book.");

        Iterator<Book> it2 = bookShelf.iterator();
        while(it2.hasNext()){

             if("George R.R. Martin".equals(it2.next().getAuthor()))
             it2.remove();

        }
        for (Book b: bookShelf) {
            System.out.println(b.getTitle());;
        }

        System.out.println("--------------Removed one more book.");
        bookShelf.remove(3);

        for (Book b: bookShelf) {
            b.bookInfo();
        }




    }
}
