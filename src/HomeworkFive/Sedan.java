package HomeworkFive;

public class Sedan extends Car {
    private int maxSpeed;

    public Sedan(String model, int releaseDate, int engineID, int maxSpeed) {
        super(model, releaseDate, engineID);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void carInfo() {
        System.out.println("Type: Sedan. Model: " + this.getModel() + ". Release date: " +
                + this.getReleaseDate() + ". Max speed: " + maxSpeed + ".");
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

}
