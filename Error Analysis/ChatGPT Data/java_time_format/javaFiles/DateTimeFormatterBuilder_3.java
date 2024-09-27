import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterBuilder_3 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('T');
        DateTimeFormatter formatter = builder.toFormatter();
        String formattedDate = formatter.format(LocalDateTime.now());
        System.out.println("Formatted date: " + formattedDate);
    }
}
