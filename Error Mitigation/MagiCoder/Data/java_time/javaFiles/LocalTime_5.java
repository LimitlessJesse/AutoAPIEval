import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalTime_5 {
    public static void main(String[] args) {
        try {
            LocalTime time = LocalTime.parse("10:15:30");
            System.out.println(time);
        } catch (DateTimeParseException e) {
            System.out.println("Unable to parse time: " + e.getMessage());
        }
    }
}
