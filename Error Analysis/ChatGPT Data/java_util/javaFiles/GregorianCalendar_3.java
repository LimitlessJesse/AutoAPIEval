import java.util.GregorianCalendar;

public class GregorianCalendar_3 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current date: " + calendar.getTime());

        // Adding 1 month to the current date
        calendar.add(GregorianCalendar.MONTH, 1);
        System.out.println("Date after adding 1 month: " + calendar.getTime());
    }
}
