package HomeworkFive;

public class Truck extends Car{
    private double loadCapacity;
    private String type;

    public Truck(String model, int releaseDate, double engineCapacity, double loadCapacity, String type) {
        super(model, releaseDate, engineCapacity);
        this.loadCapacity = loadCapacity;
        this.type = type;
    }

    @Override
    public void carInfo() {
        System.out.println("Type: Truck. Model: " + this.getModel() + ". Release date: " +
                + this.getReleaseDate() + ". Engine capacity: " +
                + this.getEngineCapacity() + ". Load capacity: " + loadCapacity + ".");
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        if(loadCapacity>0 && loadCapacity<100000)
        this.loadCapacity = loadCapacity;
        System.out.println("Check please if you set the load capacity correctly");
    }

    @Override
    public void setEngineCapacity(double engineCapacity) {
        if(engineCapacity>2 && engineCapacity<100)
        super.setEngineCapacity(engineCapacity);
        else
            System.out.println("Check please if you set the engine capacity correctly");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

