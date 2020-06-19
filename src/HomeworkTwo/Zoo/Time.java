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
    public void time(Time t){
        System.out.println(t.hour + ":" + t.minutes);
    }
}
