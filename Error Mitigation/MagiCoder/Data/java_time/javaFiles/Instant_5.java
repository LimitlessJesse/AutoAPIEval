import java.time.Instant;
import java.time.format.DateTimeParseException;

public class Instant_5 {
    public static void main(String[] args) {
        try {
            Instant instant = Instant.parse("2007-12-03T10:15:30.00Z");
            System.out.println(instant);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date time format");
        }
    }
}
