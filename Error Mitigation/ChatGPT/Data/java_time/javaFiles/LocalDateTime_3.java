import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_3 {
    public static void main(String[] args) {
        String text = "2007-12-03T10:15:30";
        LocalDateTime dateTime = LocalDateTime.parse(text, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(dateTime);
    }
}
