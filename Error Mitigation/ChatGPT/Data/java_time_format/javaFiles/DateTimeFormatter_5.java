import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.format.DateTimeParseException;

public class DateTimeFormatter_5 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH.mm[ VV]");
        String str = "2022-12-31 23.59";
        
        TemporalAccessor dt = formatter.parseBest(str, ZonedDateTime::from, LocalDateTime::from);
        
        if (dt instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = ZonedDateTime.from(dt);
            System.out.println("Parsed ZonedDateTime: " + zonedDateTime);
        } else if (dt instanceof LocalDateTime) {
            LocalDateTime localDateTime = LocalDateTime.from(dt);
            System.out.println("Parsed LocalDateTime: " + localDateTime);
        } else {
            throw new DateTimeParseException("Unable to parse the requested result", str, 0);
        }
    }
}
