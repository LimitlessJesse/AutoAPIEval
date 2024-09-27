import java.time.chrono.MinguoDate;
import java.time.temporal.ChronoUnit;

public class MinguoDate_4 {
    public static void main(String[] args) {
        MinguoDate minguoDate = MinguoDate.now();
        MinguoDate endExclusive = minguoDate.plus(1, ChronoUnit.DAYS);

        long until = minguoDate.until(endExclusive, ChronoUnit.DAYS);

        System.out.println("The amount of time until the specified temporal object is later than this date-time: " + until);
    }
}
