import java.time.chrono.HijrahDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.LocalTime;

public class HijrahDate_5 {
    public static void main(String[] args) {
        // Create a Hijrah Date
        HijrahDate hijrahDate = HijrahDate.now();

        // Get the ChronoLocalDateTime from the HijrahDate and set time using atTime
        ChronoLocalDateTime<HijrahDate> chronoLocalDateTime = hijrahDate.atTime(LocalTime.of(12, 30, 45));

        System.out.println("ChronoLocalDateTime with Hijrah Date and Time: " + chronoLocalDateTime);
    }
}
