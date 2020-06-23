package HomeworkFive;

import java.util.Calendar;
import java.util.Date;

public class Car {
    private String model;
    private int releaseDate;
    private Engine engine;

    public Car(String model, int releaseDate, int engineID) {
        this.model = model;
        this.releaseDate = releaseDate;
        this.engine = new Engine(engineID);
    }



    public void carInfo(){
        System.out.println("Model: " + model + ". Release date: " + releaseDate + ".");
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



}

