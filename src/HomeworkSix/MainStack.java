package HomeworkSix;

import java.util.*;

public class MainStack {


    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Vogue", "Fashion and beautiful", 100000);
        Magazine magazine2 = new Magazine("Time", "News", 70000);
        Magazine magazine3 = new Magazine("BusinessWeek", "Business", 50000);
        Magazine magazine4 = new Magazine("Eurofootball", "Sport", 60000);
        Stack <Magazine> stackOfMagazine = new Stack<>();

        stackOfMagazine.push(magazine1);
        stackOfMagazine.push(magazine2);
        stackOfMagazine.push(magazine3);
        stackOfMagazine.push(magazine4);

        stackOfMagazine.sort(Magazine::compareTo);
        for (Magazine m: stackOfMagazine) {
            System.out.println(m.title + m.edition);
        }
       CommonIterator<Magazine> iterator = new CommonIterator<>(stackOfMagazine);

        while(iterator.hasNext()){
            System.out.println(iterator.next().title);
        }
        System.out.println("____________________");
        for (Magazine m: stackOfMagazine) {
            System.out.println(m.title);
        }





    }
}
