package Homework3;

public class Rocket extends Section{

    private Section section1;
    private Section section2;
    private Section section3;
    private Astronaut member1;
    private Astronaut member2;

    public Rocket(String name, Section section1,
                  Section section2, Section section3, Astronaut member1,
                  Astronaut member2) {
        super(name,section1.quantityOfFuel+section2.quantityOfFuel+
                section3.quantityOfFuel);
        this.section1 = section1;
        this.section2 = section2;
        this.section3 = section3;
        this.member1 = member1;
        this.member2 = member2;
        this.quantityOfFuel = section1.quantityOfFuel+section2.quantityOfFuel+
                section3.quantityOfFuel;
    }

    public void massage(){
        String text = "The section is run out of fuel.";
        Sender massage = (member1.surName == "Peterson")?
                new Email(name, text):
                new SMS(text);
        //Too see catching of OutOfNetworkException set network false for massage.
        //massage.setNetwork(false);
        try{
            System.out.println(massage.send());
        }
        catch (OutOfNetworkException e){
            System.out.println("There is not network coverage for " + e.getMessage());
        }
    }

    public void launch(ISS iss) throws UnlockedException, QuantityFuelException{
        if(!section1.doorsAreLocked)
            throw new UnlockedException(section1.name);
        if(!section2.doorsAreLocked)
            throw new UnlockedException(section2.name);
        if(!section3.doorsAreLocked)
            throw new UnlockedException(section3.name);

        if (this.quantityOfFuel < iss.getQuantityOfFuel()) {
            throw new QuantityFuelException();
        } else {

                Status.START.status();

                section3.startUseSection();
                massage();
                section2.startUseSection();
                massage();
                section1.startUseSection();
                Status.STOP.status();

            }

    }

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
              if (name.matches("\\w+"))
                this.name = name;
            }

            public double getWeight() {
                return weight;
            }

            public void setWeight(double weight) {
            if(weight>0)
            this.weight = weight;
            }

            public double getHeight() {
                return height;
            }

            public void setHeight(double height) {
              if (height>0)
                this.height = height;
            }

            public double getDiameter() {
                return diameter;
            }

            public void setDiameter(double diameter) {
               if (diameter > 0)
                this.diameter = diameter;
            }

            public double getQuantityOfFuel() {
                return quantityOfFuel;
            }

            public void setQuantityOfFuel(double quantityOfFuel) {
                if (quantityOfFuel >0)
                this.quantityOfFuel = quantityOfFuel;
            }

            public Astronaut getMember1() {
                 return member1;
             }
             public void setMember1(Astronaut member1) {
               if(member1.surName.matches("^[A-Z][a-z]+") &&
                       member1.firstName.matches("^[A-Z][a-z]+"))
                 this.member1 = member1;
             }

    public Astronaut getMember2() {

        return member2;
    }

    public void setMember2(Astronaut member2) {
        if(member2.surName.matches("^[A-Z][a-z]+") &&
                member2.firstName.matches("^[A-Z][a-z]+"))
            this.member2 = member2;
    }
}

