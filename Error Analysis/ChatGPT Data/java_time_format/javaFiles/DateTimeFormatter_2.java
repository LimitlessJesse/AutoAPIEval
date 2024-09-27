import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatter_2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM);
        String formattedDateTime = formatter.format(now);
        
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
