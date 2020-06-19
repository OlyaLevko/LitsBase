package HomeworkTwo.Zoo;

public class Zoo {
    public final int id;
    public String name;
    public Time open;
    public Time close;

    public Zoo(int id, String name, Time open, Time close) {
        this.id = id;
        this.name = name;
        this.open = open;
        this.close = close;
    }

}
