package HomeworkFive;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Garage garage;
        Car car = new Car();
        garage = new Garage<>(car);
        System.out.println(garage.type);
        Truck truck = new Truck();
        garage = new Garage<>(truck);
        System.out.println(garage.type);
        Sedan sedan = new Sedan();
        garage = new Garage<>(sedan);
        System.out.println(garage.type);
        Bus bus = new Bus();
        garage = new Garage<>(bus);
        System.out.println(garage.type);

    }
/*      Не вдається використати принцип полімофізму для car
        Car car = new Car();
        Garage garage = new Garage(car);
        car = new Truck();
        garage = new Garage<>(car);в цьому місці car сприймає як Car а не Truck;
        car = new Sedan();
        garage = new Garage<>(car);


*/

}
