package HomeworkSix;

import java.util.*;

public class MainStack {


    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Vogue", "Fashion and beautiful", 100000);
        Magazine magazine2 = new Magazine("Time", "News", 70000);
        Magazine magazine3 = new Magazine("BusinessWeek", "Business", 50000);
        Magazine magazine4 = new Magazine("Eurofootball", "Sport", 60000);
        myStack<Magazine> stack = new myStack<>(10);
        stack.add(magazine1);
        stack.add(magazine2);
        stack.add(magazine3);
        stack.add(magazine4);
        Iterator<Magazine> it = stack.iterator();

        stack.add(2, magazine4);

        System.out.println(stack.get(2).title);

        for (Magazine m: stack) {
            System.out.println(m.title);
        }




    }
}
