package HomeworkThree;

import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args) {
        Astronaut member1 = new Astronaut("John", "Peterson");
        Astronaut member2 = new Astronaut("Nickolaus", "Trimmer");


        Section1 section1 = new Section1("Dragon1", 2000);
        Section2 section2 = new Section2("Dragon2", 2000);
        Section3 section3 = new Section3("Dragon3", 2000);

        Rocket spaceX = new Rocket("SpaceX", section1, section2, section3, member1, member2);
        spaceX.launch(new ISS("ISS", 320000, 6000));



    }

}
