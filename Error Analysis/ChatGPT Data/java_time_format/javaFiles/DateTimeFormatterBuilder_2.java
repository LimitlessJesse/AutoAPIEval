import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTimeFormatterBuilder_2 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeFormatter formatter = builder.parseCaseInsensitive().toFormatter();
        
        String input = "2021-12-31T12:30:45";
        System.out.println(formatter.parse(input));
    }
}
