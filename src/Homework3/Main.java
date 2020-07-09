package Homework3;


public class Main {
    public static void main(String[] args) {
        Astronaut member1 = new Astronaut("John", "Peterson");
        Astronaut member2 = new Astronaut("Nickolaus", "Trimmer");


        Section section1 = new Section("Dragon1", 4000);
        Section section2 = new Section("Dragon2", 2000);
        Section section3 = new Section("Dragon3", 1000);

        Rocket spaceX = new Rocket("SpaceX", section1, section2, section3, member1, member2);
        //To see catching of UnlockedException, change the values of doorsAreLocked.
        //section1.doorsAreLocked = true;
        //section2.doorsAreLocked = true;
        //section3.doorsAreLocked = false;

        ISS iss = new ISS("Moon", 320000, 6000);

        try{
            spaceX.launch(iss);
        }
            catch(UnlockedException e){
        System.out.println(e.toString() +
                " can has unlocked door. Check please if every door is locked in this section.");
         }
            catch(QuantityFuelException e){
                System.out.println("The fuel is not enough to get to the " + iss.getName());
        }
    }
}
