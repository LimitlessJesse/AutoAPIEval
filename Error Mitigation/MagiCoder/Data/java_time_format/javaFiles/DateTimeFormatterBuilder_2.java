import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterBuilder_2 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = builder.toFormatter();
        System.out.println(formatter);
    }
}
