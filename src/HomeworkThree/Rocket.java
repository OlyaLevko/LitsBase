package HomeworkThree;

public class Rocket {
    private String name;
    private double weight;
    private double hight;
    private double diameter;
    private Section1 section1;
    private Section2 section2;
    private Section3 section3;
    private  Astronaut member1;
    private Astronaut member2;
    private double quantityOfFuel;



    public Rocket(String name, Section1 section1,
                  Section2 section2, Section3 section3, Astronaut member1, Astronaut member2) {
        this.name = name;
        this.section1 = section1;
        this.section2 = section2;
        this.section3 = section3;
        this.member1 = member1;
        this.member2 = member2;
        quantityOfFuel = section1.quantityOfFuel+section2.quantityOfFuel+section3.quantityOfFuel;

    }

    public void launch(ISS iss) {
        if (quantityOfFuel<iss.getQuantityOfFuel()){
            System.out.println("Fuel is not enough to get to " + iss.getName());
        }
        else {
            Status.START.status();

            section3.startUseSection();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getQuantityOfFuel() {
        return quantityOfFuel;
    }

    public void setQuantityOfFuel(double quantityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
    }
}
