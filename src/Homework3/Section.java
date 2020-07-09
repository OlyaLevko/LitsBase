package Homework3;

public class Section {
    public String name;
    public double weight;
    public double height;
    public double diameter;
    public double quantityOfFuel;
    public boolean doorsAreLocked = true;

    public Section(String name, double quantityOfFuel) {
        this.name = name;
        this.quantityOfFuel = quantityOfFuel;
    }

    public void startUseSection()  {

        System.out.println(name + " started.");
        Status.FLY.status();
        while(quantityOfFuel>0){
            quantityOfFuel = quantityOfFuel -100;
        }
    }

}
