import java.time.LocalTime;

public class Time {
    LocalTime time;
    int second;
    int minutes;
    int hour;


    Time(LocalTime param){
        this.time = param;
        this.second = param.getSecond();
        this.minutes = param.getMinute();
        this.hour = param.getHour();

    }

    Time(int param){
        this.hour = param / 3600 % 24 ;
        this.minutes = param / 60 % 60;
        this.second = param % 60;
    }

    public String toString()
    {
        return hour + ":" + minutes + ":" + second;
    }
}
