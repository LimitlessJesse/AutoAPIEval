import java.time.chrono.MinguoChronology;
import java.time.temporal.TemporalField;
import java.time.format.ResolverStyle;
import java.util.HashMap;
import java.util.Map;

public class MinguoChronology_3 {
    public static void main(String[] args) {
        Map<TemporalField, Long> fieldValues = new HashMap<>();
        fieldValues.put(MinguoChronology.ERA, 1L);
        fieldValues.put(MinguoChronology.YEAR_OF_ERA, 108L);

        ResolverStyle resolverStyle = ResolverStyle.STRICT;

        MinguoChronology minguoChronology = MinguoChronology.INSTANCE;
        System.out.println(minguoChronology.resolveDate(fieldValues, resolverStyle));
    }
}
