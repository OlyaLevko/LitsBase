package HomeworkThree;

public class Section3 extends Section2 {




    public Section3(String name, double quantityOfFuel) {
        super(name, quantityOfFuel);

    }

    public void startUseSection(){
        System.out.println("Section3 is being used.");
        while(quantityOfFuel > 0){
            quantityOfFuel = quantityOfFuel -100;
        }
        Status.FLY.status();
        Sender massage;
        massage = new Email(this.name, "Fuel in Section3 is run out.");
        System.out.println(massage.send());
        super.startUseSection();

    }

}
