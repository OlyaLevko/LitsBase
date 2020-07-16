package HomeworkNine;

import org.w3c.dom.ls.LSOutput;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;



public class DateAPI {
    public static void main(String[] args) {
        //Is my birthday today?
        LocalDate birthday = LocalDate.of(1990, 07, 22);
        LocalDate today = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM");
        System.out.println(birthday.format(df).equals(today.format(df)) ?
                "My birthday is today." :
                "My birthday is not today.");

        //How to check if some year is leap?
        Year year = Year.of(2400);
        System.out.println(year.isLeap() ?
                "Year " + year + " is leap." : "Year " + year + " is not leap.");

        //How to count how many days are between two dates?
        LocalDate date1 = LocalDate.of(2019, Month.JULY, 30);
        LocalDate date2 = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(date1, date2));


        //To parse date from String.

        String one =  "02001.July.04 AD 12:08 PM";
        String two = "2001.07.04 AD at 12:08:56 PDT";
        String three = "12 o'clock PM, Pacific Daylight Time";
        String four = "010704120856-0700";
        String five = "0:08 PM, PDT";



        System.out.println("-------into Date-------");

       DateFormat sf1 = new SimpleDateFormat("yyyyy.MMMM.dd G hh:mm a", Locale.ENGLISH);
       DateFormat sf2 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z", Locale.ENGLISH);
       DateFormat sf3 = new SimpleDateFormat("hh 'o''clock' a, zzzz", Locale.ENGLISH);
       DateFormat sf4 = new SimpleDateFormat("yyMMddHHmmssZ", Locale.ENGLISH);
       DateFormat sf5 = new SimpleDateFormat("KK:mm a, z", Locale.ENGLISH);
       TimeZone tzPacific = TimeZone.getTimeZone("America/Los_Angeles");
       sf1.setLenient(false);
       sf2.setLenient(false);
       sf3.setLenient(false);
       sf4.setLenient(false);
       sf5.setLenient(false);
       sf1.setTimeZone(tzPacific);
       sf2.setTimeZone(tzPacific);
       sf3.setTimeZone(tzPacific);
       sf4.setTimeZone(tzPacific);
       sf5.setTimeZone(tzPacific);
       System.out.println();


        try {
            Date dateOne = sf1.parse(one);
            Date dateTwo = sf2.parse(two);
            Date dateThree = sf3.parse(three);
            Date dateFour = sf4.parse(four);
            Date dateFive = sf5.parse(five);
            System.out.println(sf1.format(dateOne.getTime()));
            System.out.println(sf2.format(dateTwo.getTime()));
            System.out.println(sf3.format(dateThree.getTime()));
            System.out.println(sf4.format(dateFour.getTime()));
            System.out.println(sf5.format(dateFive.getTime()));
        } catch (ParseException e) {
            e.getStackTrace();
            System.out.println("The date didn't parse.");
        }



        System.out.println("-------into LocalDate-------");

        DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("yyyyy.MMMM.dd G hh:mm a", Locale.ENGLISH);
        DateTimeFormatter tf2 = DateTimeFormatter.ofPattern("yyyy.MM.dd G 'at' HH:mm:ss z", Locale.ENGLISH);
        DateTimeFormatter tf3 = DateTimeFormatter.ofPattern("hh 'o''clock' a, zzzz", Locale.ENGLISH);
        DateTimeFormatter tf4 = DateTimeFormatter.ofPattern("yyMMddHHmmssZ", Locale.ENGLISH);
        DateTimeFormatter tf5 = DateTimeFormatter.ofPattern("K:mm a, z", Locale.ENGLISH);

        LocalDate localDate1 = LocalDate.parse(one, tf1);
        LocalDate localDate2 = LocalDate.parse(two, tf2);
        LocalDate localDate4 = LocalDate.parse(four, tf4);
        System.out.println(localDate1.format(DateTimeFormatter.ofPattern("yyyyy.MMMM.dd",Locale.ENGLISH)));
        System.out.println(localDate2.format(DateTimeFormatter.ofPattern("yyyy.MM.dd",Locale.ENGLISH)));
        System.out.println(localDate4.format(DateTimeFormatter.ofPattern("yyMMdd",Locale.ENGLISH)));


        System.out.println("-------into LocalTime-------");

        LocalTime localTime1 = LocalTime.parse(one,tf1);
        LocalTime localTime2 = LocalTime.parse(two,tf2);
        LocalTime localTime3 = LocalTime.parse(three,tf3);
        LocalTime localTime4 = LocalTime.parse(four,tf4);
        LocalTime localTime5 = LocalTime.parse(five,tf5);


        System.out.println(localTime1.format(DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH)));
        System.out.println(localTime2.format(DateTimeFormatter.ofPattern("'at' HH:mm:ss", Locale.ENGLISH)));
        System.out.println(localTime3.format(DateTimeFormatter.ofPattern("hh 'o''clock' a", Locale.ENGLISH)));
        System.out.println(localTime4.format(DateTimeFormatter.ofPattern("HHmmss", Locale.ENGLISH)));
        System.out.println(localTime5.format(DateTimeFormatter.ofPattern("K:mm a", Locale.ENGLISH)));

        System.out.println("-------into LocalDateTime-------");

        DateTimeFormatterBuilder formatterBuilder3 = new DateTimeFormatterBuilder();
        formatterBuilder3.append(tf3).parseDefaulting(ChronoField.YEAR, 0)
                .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
                .parseDefaulting(ChronoField.DAY_OF_MONTH, 1);
        DateTimeFormatter formatter3 = formatterBuilder3.toFormatter(Locale.ENGLISH);



        DateTimeFormatterBuilder formatterBuilder5 = new DateTimeFormatterBuilder();
        formatterBuilder5.appendOptional(tf5).parseDefaulting(ChronoField.YEAR, 0)
                .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
                .parseDefaulting(ChronoField.DAY_OF_MONTH, 1);
        DateTimeFormatter formatter5 = formatterBuilder5.toFormatter(Locale.ENGLISH);

        LocalDateTime localDateTime1 = LocalDateTime.parse(one,tf1);
        LocalDateTime localDateTime2 = LocalDateTime.parse(two,tf2);
        LocalDateTime localDateTime3 = LocalDateTime.parse(three,formatter3);
        LocalDateTime localDateTime4 = LocalDateTime.parse(four,tf4);
        LocalDateTime localDateTime5 = LocalDateTime.parse(five,formatter5);

        System.out.println(localDateTime1.format(tf1));
        System.out.println(localDateTime2.format(DateTimeFormatter.ofPattern("yyyy.MM.dd G 'at' HH:mm:ss", Locale.ENGLISH)));
        System.out.println(localDateTime3.format(DateTimeFormatter.ofPattern("hh 'o''clock' a", Locale.ENGLISH)));
        System.out.println(localDateTime4.format(DateTimeFormatter.ofPattern("yyMMddHHmmss", Locale.ENGLISH)));
        System.out.println(localDateTime5.format(DateTimeFormatter.ofPattern("K:mm a", Locale.ENGLISH)));

        System.out.println("-------into ZonedDateTime-------");

        ZoneId zoneId = ZoneId.of("America/Los_Angeles");

        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse(one,tf1.withZone(zoneId));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(two,tf2.withZone(zoneId));
        ZonedDateTime zonedDateTime3 = ZonedDateTime.parse(three,formatter3.withZone(zoneId));
        ZonedDateTime zonedDateTime4 = ZonedDateTime.parse(four,tf4.withZone(zoneId));
        ZonedDateTime zonedDateTime5 = ZonedDateTime.parse(five,formatter5.withZone(zoneId));

        System.out.println(zonedDateTime1.format(tf1.withZone(zoneId)));
        System.out.println(zonedDateTime2.format(tf2.withZone(zoneId)));
        System.out.println(zonedDateTime3.format(formatter3.withZone(zoneId)));
        System.out.println(zonedDateTime4.format(tf4.withZone(zoneId)));
        System.out.println(zonedDateTime5.format(formatter5.withZone(zoneId)));




    }
}
