package HomeworkThree;

public class Rocket {
    public String name;
    public Astronaut [] team;
    public int numberOfSections;
    public double weight;
    public double hight;
    public double diameter;
    public double quantityOfFuel;

    public Rocket(String name, Astronaut[] team, int numberOfSections, double quantityOfFuel) {
        this.name = name;
        this.team = team;
        this.numberOfSections = numberOfSections;
        this.quantityOfFuel = quantityOfFuel;
    }

    public void Start(Destination destination) {

        if (destination.quantityOfFuel < quantityOfFuel) {
            System.out.println(name + " has been started successful");
            double distanceFromTheEarth=0;
            double distanceBetweenSections=0;
            while (distanceFromTheEarth < destination.distance) {
                distanceBetweenSections = distanceBetweenSections + 100;// припустимо, що на кожних
                distanceFromTheEarth = distanceFromTheEarth + 1000;               //1000км секції будуть
            }                                                                    //ввіддалятися одна від одної
        } else                                                                   //на 100км
            System.out.println("The fuel is not enough to get to " + destination.name);
    }
}
