import java.util.Scanner;

public class Time {
    public int hour;
    public int minute;
    public int second;
    public Time(){}
    Time(int hour, int minute, int second){
        this.hour= hour;
        this.minute=minute;
        this.second=second;
    }
    public String toUniversal() {
        String s = "";
        if(hour < 10) {
            s = s + "0" + hour + ":";
        }
        else {
            s += hour + ":";
        }

        if(minute < 10) {
            s = s + "0" + minute + ":";
        }
        else {
            s += minute + ":";
        }
        if(second < 10) {
            s = s + "0" + second;
        }
        else {
            s += second;
        }

        return s;
    }

    public String toStandard() {
        String s = "";
        if(hour < 12 && hour > 0) {
            if(hour < 10) {
                s = s + "0" + hour + ":";
            }
            else {
                s += hour + ":";
            }

            if(minute < 10) {
                s = s + "0" + minute + ":";
            }
            else {
                s += minute + ":";
            }
            if(second < 10) {
                s = s + "0" + second;
            }
            else {
                s += second;
            }

            s += " AM";
        }
        else if(hour > 12){
            hour -= 12;
            if(hour < 10) {
                s = s + "0" + hour + ":";
            }
            else {
                s += hour + ":";
            }

            if(minute < 10) {
                s = s + "0" + minute + ":";
            }
            else {
                s += minute + ":";
            }
            if(second < 10) {
                s = s + "0" + second;
            }
            else {
                s += second;
            }

            s += " PM";
        }
        else if(hour == 12) {
            s += 12 + ":" ;
            if(minute < 10) {
                s = s + "0" + minute + ":";
            }
            else {
                s += minute + ":";
            }
            if(second < 10) {
                s = s + "0" + second;
            }
            else {
                s += second;
            }

            s += " PM";
        }
        else if(hour == 0) {
            s += 12 + ":";

            if(minute < 10) {
                s = s + "0" + minute + ":";
            }
            else {
                s += minute + ":";
            }
            if(second < 10) {
                s = s + "0" + second;
            }
            else {
                s += second;
            }

            s += " AM";
        }
        return s;
    }


    public Time add(Time t) {
        Time time = new Time();
        time.hour = this.hour + t.hour;
        time.minute = this.minute + t.minute;
        time.second = this.second + t.second;

        if(time.second > 59) {
            time.minute += time.second/60;
            time.second %= 60;
        }
        if(time.minute > 59) {
            time.hour += time.minute/60;
            time.minute %= 60;
        }
        if(time.hour > 23) {
            time.hour = time.hour - 24;
        }
        return time;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Time t= new Time(23,5,6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2= new Time(4,24,33);
        Time sum= new Time();
        sum=t.add(t2);
        System.out.println("sum is: ");
        System.out.println(sum.toUniversal());
        System.out.println(sum.toStandard());
    }
}