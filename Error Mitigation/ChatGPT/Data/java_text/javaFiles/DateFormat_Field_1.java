import java.text.DateFormat;

public class DateFormat_Field_1 {
    public static void main(String[] args) {
        DateFormat.Field field = DateFormat.Field.HOUR0;
        int calendarField = field.getCalendarField();
        System.out.println("Calendar field associated with this attribute: " + calendarField);
    }
}
