package HomeworkTwo.Zoo;

public class Main {


    public static void main(String[] args) {
        Zoo limpopo = new Zoo(001, "Limpopo", new Time(9, 00), new Time(20, 00));
        System.out.println(limpopo.name);
        limpopo.open.time();
        limpopo.close.time();
    }
}
