import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class Instant_4 {
    public static void main(String[] args) {
        TemporalAccessor temporal = new TemporalAccessor() {
            @Override
            public <R extends java.time.temporal.TemporalQuery<?>> R query(R query) {
                if (query == ChronoField.INSTANT_SECONDS) {
                    return (R) ChronoField.INSTANT_SECONDS.getFrom(this);
                } else if (query == ChronoField.NANO_OF_SECOND) {
                    return (R) ChronoField.NANO_OF_SECOND.getFrom(this);
                }
                return null;
            }

            @Override
            public boolean isSupported(java.time.temporal.TemporalField field) {
                return field == ChronoField.INSTANT_SECONDS || field == ChronoField.NANO_OF_SECOND;
            }
        };

        Instant instant = Instant.from(temporal);
        System.out.println(instant);
    }
}
