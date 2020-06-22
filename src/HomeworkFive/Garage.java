package HomeworkFive;

public class Garage <T extends Car>{
    T type1;
    T type2;
    T type3;

    public Garage(T type1, T type2, T type3) {
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
    }

    public Garage(T type1) {
        this.type1 = type1;
    }

    public Garage(T type1, T type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public void contains(){
        if((type3 == null)&&(type2 == null))
        System.out.println("This garage contains " + type1.getModel() + ".");
        else if ((type3 == null)&&!(type2 == null))
            System.out.println("This garage contains " + type1.getModel() + " " + type2.getModel() + ".");
        else
            System.out.println("This garage contains " + type1.getModel() + " " + type2.getModel() + " " + type3.getModel() + ".");

    }
}
