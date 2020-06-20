package HomeworkTwo.Zoo;

public class Time {
    public int hour;
    public int minutes;

    public Time(int hour, int minutes) {
        if (hour>=0 && hour<24 && minutes>=0 && minutes<60){
            this.hour = hour;
            this.minutes = minutes;
        }
        else System.out.println("Time is not correct");
    }
    public void time(){
        if (hour>0 && hour <10) {
            System.out.print("0" + hour + ":" );
        }
        else{
            System.out.print(hour + ":");
        }
        if (minutes>=0 && minutes<10){
            System.out.println("0" + minutes);
        }
        else{
            System.out.println(minutes);
        }
    }

}
