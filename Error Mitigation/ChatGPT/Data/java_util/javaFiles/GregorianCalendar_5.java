import java.util.GregorianCalendar;

public class GregorianCalendar_5 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int maxDayOfMonth = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Maximum day of month: " + maxDayOfMonth);
    }
}
