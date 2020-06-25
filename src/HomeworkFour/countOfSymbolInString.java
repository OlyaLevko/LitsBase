package HomeworkFour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countOfSymbolInString {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder( "I! thi-nk that? is a great idea.");

        int l = s.length();
        char [] symbol = new char[l];


        for (int i = 0; i < l; i++) {

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < l; ) {
                if(symbol[i] == symbol[j]){
                    sb.append(symbol[i]);
                    s.delete(j, j+1);

                    l--;
                }
                else j++;
            }

            System.out.println(symbol[i] + " " + sb.length());
        }


    }
}
