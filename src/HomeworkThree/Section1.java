package HomeworkThree;

public class Section1 {
    public String name;
    public double quantityOfFuel;

    public Section1(String name, double quantityOfFuel) {
        this.name = name;
        this.quantityOfFuel = quantityOfFuel;
    }

    public void startUseSection(){
        System.out.println("Section1 is being used.");
        while(quantityOfFuel>0){
            quantityOfFuel = quantityOfFuel -100;
        }
        Status.STOP.status();
    }
}




