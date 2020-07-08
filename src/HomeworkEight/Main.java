package HomeworkEight;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        myHashMap<String, String> map = new myHashMap<>(10);
        map.put(null, "London");
        map.put("two", "Paris");
        map.put("two", "NY");
        map.put("tree", "Berlin");

        System.out.println(map.get("two"));
        System.out.println(map.size());

        Set set = map.keySet();
        for (Object s: set) {
            System.out.println(s);
        }

        map.remove(null);

        Set set1 = map.keySet();
        for (Object s: set1) {
            System.out.println(s);
        }

    }
}
