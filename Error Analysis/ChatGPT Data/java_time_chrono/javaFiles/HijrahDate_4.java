import java.time.chrono.HijrahDate;

public class HijrahDate_4 {
    public static void main(String[] args) {
        HijrahDate date = HijrahDate.now();
        int lengthOfYear = date.lengthOfYear();
        System.out.println("Length of Hijrah year: " + lengthOfYear);
    }
}
