import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatter_3 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String text = "2022-01-01 12:00:00";
        
        try {
            TemporalAccessor temporalAccessor = formatter.parse(text);
            System.out.println(temporalAccessor);
        } catch (DateTimeParseException e) {
            System.out.println("Unable to parse the text: " + e.getMessage());
        }
    }
}
