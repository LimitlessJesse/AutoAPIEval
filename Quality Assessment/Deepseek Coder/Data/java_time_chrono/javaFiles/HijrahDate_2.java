import java.time.chrono.HijrahDate;

public class HijrahDate_2 {
    public static void main(String[] args) {
        HijrahDate date = HijrahDate.now();
        long epochDay = date.toEpochDay();
        System.out.println(epochDay);
    }
}
