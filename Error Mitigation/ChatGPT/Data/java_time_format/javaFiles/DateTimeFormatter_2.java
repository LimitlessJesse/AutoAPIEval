import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DateTimeFormatter_2 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        
        String formattedDateTime = formatter.format(dateTime);
        System.out.println("Formatted date-time: " + formattedDateTime);
    }
}
