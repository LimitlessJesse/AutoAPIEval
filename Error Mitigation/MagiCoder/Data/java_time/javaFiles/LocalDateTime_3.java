import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateTime_3 {
    public static void main(String[] args) {
        try {
            LocalDateTime dateTime = LocalDateTime.parse("2007-12-03T10:15:30");
            System.out.println(dateTime);
        } catch (DateTimeParseException e) {
            System.out.println("Unable to parse date-time: " + e.getMessage());
        }
    }
}
