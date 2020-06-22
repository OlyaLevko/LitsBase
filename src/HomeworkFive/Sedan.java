package HomeworkFive;

public class Sedan extends Car {
    private int maxSpeed;

    public Sedan(String model, int releaseDate, double engineCapacity, int maxSpeed) {
        super(model, releaseDate, engineCapacity);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void carInfo() {
        System.out.println("Type: Sedan. Model: " + this.getModel() + ". Release date: " +
                + this.getReleaseDate() + ". Engine capacity: " +
                + this.getEngineCapacity() + ". Max speed: " + maxSpeed + ".");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed>0 && maxSpeed<1000)
        this.maxSpeed = maxSpeed;
        else
            System.out.println("Check please if you set the max speed correctly");
    }

    @Override
    public void setEngineCapacity(double engineCapacity) {
        if(engineCapacity<10)
        super.setEngineCapacity(engineCapacity);
        else
            System.out.println("Check please if you set the engine capacity correctly");


    }
}
