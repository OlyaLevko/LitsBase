package HomeworkSeven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Car implements Comparable<Car> {

    private String make;
    private String model;
    private int year;
    private String engineType;
    private double engineCapacity;

    public Car(String make, String model, int year, String engineType, double engineCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
    }

    public void carInfo(){
        System.out.println("The car: make " + make +
                 ", model " + model + ", year of release " + year +
                ", an engine type " + engineType + ", an engine capacity " +
                engineCapacity + ".");
    }


    @Override
    public int compareTo(Car o) {
       return this.compareMake(o);

    }

    public int compareToRevers(Car o){

         return -this.compareMake(o);
    }

    public int compareBy(Car o) throws IOException {
        System.out.println(" Enter column name for sort.");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String columnName = bf.readLine();

        int i;
        switch(columnName){

            case "make": i = compareMake(o);
            break;
            case "model": i = compareModel(o);
            break;
            case "year": i = compareYear(o);
            break;
            case "engineType": i = compareEngine(o);
            break;
            case "engineCapacity": i = compareCapacity(o);
            break;
            default:
                System.out.println("There is not such a column." +
                        " Enter a column name one of : make, model, year, engineType, engineCapacity.");
                i = 0;
        }
        return i;
    }

    public int compareMake(Car o){
        if(make.compareTo(o.make)==0) return this.compareModel(o);
        return make.compareTo(o.make);
    }
    public int compareModel(Car o){
        if(model.compareTo(o.model)==0) return this.compareYear(o);
        return model.compareTo(o.model);
    }
    public  int compareYear(Car o){
        if (year<o.year) return  -1;
        else if(year == o.year) return this.compareEngine(o);
        else return 1;
    }
    public int compareEngine(Car o){
        if (engineType.compareTo(o.engineType)==0) return this.compareCapacity(o);
        return engineType.compareTo(o.engineType);
    }

    public int compareCapacity(Car o){
        if (engineCapacity<o.engineCapacity) return  -1;
        else if(engineCapacity == o.engineCapacity) return 0;
        else return 1;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        Calendar calendar = Calendar.getInstance();

        if (year>1900 && year<=calendar.get(Calendar.YEAR))
            this.year = year;

    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (engineType == "Straight Engine" | engineType ==  "V Type Engine" |
                engineType == "Boxer Engine" | engineType == "Rotary Engine" |
                engineType == "Diesel Engine");
        this.engineType = engineType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if(engineCapacity>0.4 && engineCapacity< 10)
        this.engineCapacity = engineCapacity;
    }
}
