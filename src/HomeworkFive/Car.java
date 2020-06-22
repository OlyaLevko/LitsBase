package HomeworkFive;

import java.util.Calendar;
import java.util.Date;

public class Car {
    private String model;
    private int releaseDate;
    private double engineCapacity;

    public Car(String model, int releaseDate, double engineCapacity) {
        this.model = model;
        this.releaseDate = releaseDate;
        this.engineCapacity = engineCapacity;
    }



    public void carInfo(){
        System.out.println("Model: " + model + ". Release date: " + releaseDate + ". Engine capacity: " +
                + engineCapacity + ".");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        Calendar calendar = Calendar.getInstance();

        if (releaseDate>1900 && releaseDate<=calendar.get(Calendar.YEAR))
        this.releaseDate = releaseDate;
        else
            System.out.println("Please enter the correct year.");
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if(engineCapacity>0 && engineCapacity<100)
        this.engineCapacity = engineCapacity;
        else
        System.out.println("Check please if you set the engine capacity correctly");
    }
}

