import java.time.format.DateTimeFormatter;
import java.text.ParsePosition;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatter_4 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String text = "2022-01-01 12:00:00";
        ParsePosition position = new ParsePosition(0);
        
        try {
            TemporalAccessor parsedTemporal = formatter.parse(text, position);
            System.out.println(parsedTemporal);
            System.out.println("Index of last character parsed: " + position.getIndex());
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing date-time: " + e.getMessage());
            System.out.println("Error index: " + e.getErrorIndex());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid position: " + e.getMessage());
        }
    }
}
