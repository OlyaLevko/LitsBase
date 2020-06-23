package HomeworkFive;

public class Engine {
    private int id;
    private double capacity;
    private String typeOgFuel;

    public Engine(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0)
        this.id = id;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity>0 && capacity<100)
            this.capacity = capacity;
        else
            System.out.println("Check please if you set the engine capacity correctly");;
    }

    public String getTypeOgFuel() {
        return typeOgFuel;
    }

    public void setTypeOgFuel(String typeOgFuel) {
        if(("gasoline".equals(typeOgFuel))|("diesel".equals(typeOgFuel)))
        this.typeOgFuel = typeOgFuel;
        else
            System.out.println("Fuel could be gasoline or diesel");
    }
}
