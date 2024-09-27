import java.text.DateFormat;
import java.text.DateFormat.Field;

public class DateFormat_Field_4 {
    public static void main(String[] args) {
        DateFormat.Field field = DateFormat.Field.ofCalendarField(1);
        System.out.println(field);
    }
}
