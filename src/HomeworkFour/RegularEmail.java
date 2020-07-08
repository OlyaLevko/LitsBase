package HomeworkFour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEmail {

    public static void main(String[] args) {


        String email = "John20-Honer_07@gmail.com";
        String regex = "^([a-zA-Z_0-9])([a-zA-Z_0-9|.|,|_|-]){0,20}([a-zA-Z_0-9])@([a-z]){1,10}.([a-z]){2,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
