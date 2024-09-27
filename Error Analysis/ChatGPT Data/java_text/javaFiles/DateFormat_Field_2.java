import java.text.DateFormat;
import java.text.DateFormat.Field;

public class DateFormat_Field_2 {
    public static void main(String[] args) {
        DateFormat.Field field = DateFormat.Field.DAY_OF_WEEK;
        int calendarField = field.getCalendarField();
        System.out.println("Calendar field value for DAY_OF_WEEK: " + calendarField);
    }
}
