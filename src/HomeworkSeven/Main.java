package HomeworkSeven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("Skoda", "Oktavia", 2015, "Diesel Engine", 1.9);
        Car car2 = new Car("Volkswagen", "Passat", 2018, "Rotary Engine", 1.8);
        Car car3 = new Car("Opel", "Astra", 2016, "Straight Engine", 1.6);
        Car car4 = new Car("Audi", "Q8", 2020, "V Type Engine", 2.5);
        Car car5 = new Car("BMW", "X6", 2017, "Boxer Engine", 2.2);
        Car car6 = new Car("Volkswagen", "Toureg", 2018, "Boxer Engine",2.5);
        Car car7 = new Car("Volkswagen", "Toureg", 2019, "V Type Engine",2.5);
        Car car8 = new Car("Volkswagen", "Toureg", 2018, "V Type Engine",3.0);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

        cars.sort(Car::compareTo);
        for (Car car:cars) {
            car.carInfo();
        }
        System.out.println("--------------------------------------------------------");
        cars.sort(Car::compareYear);

        for (Car car:cars) {
            car.carInfo();
        }
        System.out.println("--------------------------------------------------------");

        cars.sort(Car::compareToRevers);
        for (Car car:cars) {
            car.carInfo();
        }

        System.out.println("-----------------------------------------------------------");


    }
}
