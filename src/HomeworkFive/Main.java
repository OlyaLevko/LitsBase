package HomeworkFive;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

       Bus bus1 = new Bus("Issusu", 2010, 4.7, 50);
       Bus bus2 = new Bus("Etalon", 2005,5.4,52);
       Bus bus3 = new Bus("LAZ", 2014, 9.0, 75);

       Sedan sedan1 = new Sedan("BMW", 2019,2.5,350);
       Sedan sedan2 = new Sedan("Audi", 2018, 3.0, 300);
       Sedan sedan3 = new Sedan("Merseded",2020, 2.5, 250);

       Truck truck1 = new Truck("MAN", 2002, 10.00, 5000, "Dump truck");
       Truck truck2 = new Truck("MACK", 2005, 15.00, 8000, "Mixer truck");
       Truck truck3 = new Truck("Volvo", 2012, 12.00, 20000, "Lorry");

       Garage<Car> garage1 = new Garage<>(bus1,sedan1,truck1);
       Garage<Bus> garage2 = new Garage<>(bus1,bus2);
       Garage<Sedan> garage3 = new Garage<>(sedan1);
       Garage<Truck> garage4 = new Garage<>(truck1, truck2, truck3);

       garage1.contains();
       garage2.contains();
       garage3.contains();
       garage4.contains();



    }


}
