package HomeworkFive;

public class Bus extends Car{
    private int maxNumberOfPassengers;

    public Bus(String model, int releaseDate, double engineCapacity, int maxNumberOfPassengers) {
        super(model, releaseDate, engineCapacity);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public void carInfo() {
        System.out.println("Type: Bus. Model: " + this.getModel() + ". Release date: " +
                + this.getReleaseDate() + ". Engine capacity: " +
                + this.getEngineCapacity() + ". Max number of passengers: " + maxNumberOfPassengers + ".");
    }

    @Override
    public void setEngineCapacity(double engineCapacity) {
        if(engineCapacity>5 && engineCapacity<40)
            super.setEngineCapacity(engineCapacity);
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        if (maxNumberOfPassengers>0 && maxNumberOfPassengers<500)
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        else
            System.out.println("Enter please the max number of passenger correctly");
    }
}
