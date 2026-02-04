package task3;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public String toUniversal(){
        if(hour > 23 || hour < 0 ||
           minute > 59 || minute < 0 ||
           second > 59 || second < 0) {
           return "Invalid input";
        }
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandart(){
        if(hour > 23 || hour < 0 ||
           minute > 59 || minute < 0 ||
           second > 59 || second < 0) {
           return "Invalid input";
        }

        int h;
        String amPm;

        if (hour == 0) {
            h = 12;
            amPm = "AM";
        } else if (hour < 12) {
            h = hour;
            amPm = "AM";
        } else if (hour == 12) {
            h = 12;
            amPm = "PM";
        } else {
            h = hour - 12;
            amPm = "PM";
        }

        return String.format("%02d:%02d:%02d %s", h, minute, second, amPm);
    }

    public void add(Time other) {
        this.second += other.second;
        this.minute += other.minute;
        this.hour += other.hour;

        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second = this.second % 60;
        }

        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        }

        if (this.hour >= 24) {
            this.hour = this.hour % 24;
        }
    }

}
