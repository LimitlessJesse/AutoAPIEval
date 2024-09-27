import java.util.GregorianCalendar;

public class GregorianCalendar_5 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int maximum = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("The maximum number of days in the current month is: " + maximum);
    }
}
