import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;

public class DateTimeFormatterBuilder_5 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
               .parseCaseInsensitive()
               .appendPattern("yyyy-MM-dd")
               .toFormatter()
               .withResolverStyle(ResolverStyle.STRICT);

        System.out.println(builder);
    }
}
