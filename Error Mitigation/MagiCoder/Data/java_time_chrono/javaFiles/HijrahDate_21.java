import java.time.chrono.HijrahDate;

public class HijrahDate_21 {
    public static void main(String[] args) {
        HijrahDate date1 = HijrahDate.now();
        HijrahDate date2 = HijrahDate.now();

        System.out.println(date1.equals(date2));
    }
}
