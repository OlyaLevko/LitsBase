package HomeworkFour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularPhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = "+38 (099) 641-78-39";
        String regex = "(^[8+(]?)([38(\\s]){0,4}" +
                "((039)|(050)|(063)|(066)|(067)|(068)|(073)|(089)|(091)|(093)|(094)|(095)|(096)|(097)|(098)|(099))"+
                        "([-).\\s]){0,2}([0-9]){3}([-.\\s])?([0-9]){2}([-.\\s])?([0-9]){2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
