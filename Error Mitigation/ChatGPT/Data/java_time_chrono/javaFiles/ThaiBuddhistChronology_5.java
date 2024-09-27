import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;
import java.time.temporal.ChronoField;
import java.time.format.ResolverStyle;
import java.util.HashMap;
import java.util.Map;

public class ThaiBuddhistChronology_5 {
    public static void main(String[] args) {
        ThaiBuddhistChronology chronology = ThaiBuddhistChronology.INSTANCE;
        
        Map<ChronoField, Long> fieldValues = new HashMap<>();
        fieldValues.put(ChronoField.YEAR, 2564L);
        fieldValues.put(ChronoField.MONTH_OF_YEAR, 10L);
        fieldValues.put(ChronoField.DAY_OF_MONTH, 5L);
        
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        
        ThaiBuddhistDate resolvedDate = chronology.resolveDate(fieldValues, resolverStyle);
        
        System.out.println("Resolved Thai Buddhist Date: " + resolvedDate);
    }
}
