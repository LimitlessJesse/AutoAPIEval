import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterBuilder_1 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeFormatter formatter = builder.toFormatter();
        System.out.println(formatter);
    }
}
