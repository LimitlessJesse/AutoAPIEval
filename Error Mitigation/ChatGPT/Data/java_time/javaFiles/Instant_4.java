import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Instant_4 {
    public static void main(String[] args) {
        String text = "2007-12-03T10:15:30.00Z";
        
        try {
            Instant instant = Instant.parse(text);
            System.out.println("Parsed Instant: " + instant);
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing Instant: " + e.getMessage());
        }
    }
}
