package HomeworkFive;

public class Bus extends Car{
    private int maxNumberOfPassengers;

    public Bus(String model, int releaseDate, int engineID, int maxNumberOfPassengers) {
        super(model, releaseDate, engineID);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public void carInfo() {
        System.out.println("Type: Bus. Model: " + this.getModel() + ". Release date: " +
                + this.getReleaseDate() + ". Max number of passengers: " + maxNumberOfPassengers + ".");
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
