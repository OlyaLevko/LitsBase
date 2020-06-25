package HomeworkSix;

import java.util.Calendar;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int releaseYear;

    public Book(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public void bookInfo(){
        System.out.println("The book " + title + " is written by " + author + ".");
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title!=null)
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author!=null)
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        Calendar calendar = Calendar.getInstance();
        if (releaseYear > 0 && releaseYear <= calendar.get(Calendar.YEAR)) {
            this.releaseYear = releaseYear;
        }
    }
}
