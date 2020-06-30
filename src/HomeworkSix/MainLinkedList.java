package HomeworkSix;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainLinkedList {
    public static void main(String[] args) {

        Book book1 = new Book("Original", "Den Brown", 2017);
        Book book2 = new Book("Witcher", "Andjei Sapkovskyi", 2010);
        Book book3 = new Book("Game of Thrones", "George R.R. Martin", 2005);
        Book book4 = new Book("Blood with milk", "Lyuko Dashwar", 2007);

        myLinkedList<Book> bookShelf = new myLinkedList<>();

        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);



        for (Book b:bookShelf    ) {
            System.out.println(b.getTitle());
        }

        ListIterator<Book>  it = bookShelf.listIterator();
        while(it.hasPrevious()){
            System.out.println(it.previous().getTitle());
            System.out.println(  it.previousIndex());
        }

        Iterator it1 = bookShelf.iterator();
        while (it1.hasNext()){


            System.out.println(((Book) it.next()).getTitle());
        }







    }
}
