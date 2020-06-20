package HomeworkThree;

public class Main {


    public static void main(String[] args) {
        Astronaut [] team ={ new Astronaut("John", "Piterson"),
                             new Astronaut("Nickolaus", "Trimmen")};

        Rocket spaceX = new Rocket("SpaceX", team, 3, 5000);



       Destination moon = new Destination("Moon",384400, 6000 );



        spaceX.Start(moon);
    }
}
