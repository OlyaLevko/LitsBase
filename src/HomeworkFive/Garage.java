package HomeworkFive;

public class Garage <T extends Car>{
    T type;
    public Garage(T type) {
        this.type = type;
    }


}
