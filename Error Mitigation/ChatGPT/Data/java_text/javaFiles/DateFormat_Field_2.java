import java.text.DateFormat;

public class DateFormat_Field_2 {
    public static void main(String[] args) {
        int calendarField = DateFormat.MONTH_FIELD;
        DateFormat.Field field = DateFormat.Field.ofCalendarField(calendarField);
        System.out.println(field);
    }
}
