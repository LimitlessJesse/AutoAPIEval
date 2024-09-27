import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.temporal.TemporalAccessor;

public class ThaiBuddhistChronology_5 {
    public static void main(String[] args) {
        TemporalAccessor temporal = ThaiBuddhistChronology.INSTANCE.dateNow();
        ChronoLocalDateTime<ThaiBuddhistDate> localDateTime = ThaiBuddhistChronology.INSTANCE.localDateTime(temporal);
        System.out.println(localDateTime);
    }
}
