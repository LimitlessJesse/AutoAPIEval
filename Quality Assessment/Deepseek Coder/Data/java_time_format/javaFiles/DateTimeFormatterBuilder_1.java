import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTimeFormatterBuilder_1 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendPattern("yyyy-MM-dd");
        DateTimeFormatter formatter = builder.toFormatter();

        LocalDate date = LocalDate.of(2022, 12, 31);
        String formattedDate = date.format(formatter);

        System.out.println(formattedDate);  // Outputs: 2022-12-31
    }
}
