package HomeworkTwo.Zoo;

public class Main {
    public static void time(Time t) {
        System.out.println(t.hour + ":" + t.minutes);
    }

    public static void main(String[] args) {
        Zoo limpopo = new Zoo(001, "Limpopo", new Time(9, 00), new Time(20, 00));
        System.out.println(limpopo.name);
        time(limpopo.open);
        time(limpopo.close);
    }
}
