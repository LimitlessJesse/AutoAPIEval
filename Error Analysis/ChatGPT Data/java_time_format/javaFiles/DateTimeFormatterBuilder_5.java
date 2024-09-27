import java.time.format.DateTimeFormatterBuilder;

public class DateTimeFormatterBuilder_5 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.padNext(4, '0'); // pad the next element with zeros up to 4 characters
    }
}
