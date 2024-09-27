import java.util.Calendar;

public class Calendar_1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date: " + calendar.getTime());

        // Adding 5 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Date after adding 5 days: " + calendar.getTime());

        // Subtracting 2 months from the current date
        calendar.add(Calendar.MONTH, -2);
        System.out.println("Date after subtracting 2 months: " + calendar.getTime());
    }
}
