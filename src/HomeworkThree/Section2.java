package HomeworkThree;

public class Section2 extends  Section1{

    public double speed;

    public Section2(String name, double quantityOfFuel) {
        super(name, quantityOfFuel);

    }

    public void startUseSection() {
        System.out.println("Section2 is being used.");
        while (quantityOfFuel > 0) {
            quantityOfFuel = quantityOfFuel - 100;
        }
        Status.FLY.status();
        Sender message;
        message = new SMS("Fuel in Section2 is run out.");
        System.out.println(message.send());
        super.startUseSection();
    }
}
