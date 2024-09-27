import java.util.GregorianCalendar;

public class GregorianCalendar_3 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Before adding: " + calendar.getTime());

        // Adding 1 month to the calendar
        calendar.add(GregorianCalendar.MONTH, 1);

        System.out.println("After adding: " + calendar.getTime());
    }
}
