package HomeworkThree;

public class ISS {

        private String name;
        private double distance;
        private double quantityOfFuel;

        public ISS(String name, double distance, double quantityOfFuel) {
            this.name = name;
            this.distance = distance;
            this.quantityOfFuel = quantityOfFuel;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getQuantityOfFuel() {
        return quantityOfFuel;
    }

    public void setQuantityOfFuel(double quantityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
    }
}
