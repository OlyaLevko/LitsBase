package HomeworkSix;

public class Magazine implements Comparable<Magazine> {
   public String title;
   public String category;
   public int edition;

    public Magazine(String title, String category, int edition) {
        this.title = title;
        this.category = category;
        this.edition = edition;
    }

    @Override
    public int compareTo(Magazine o) {
        if(edition<o.edition) return -1;
        if(edition>o.edition) return 1;
        return 0;
    }




}
