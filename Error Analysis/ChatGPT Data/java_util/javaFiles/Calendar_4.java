import java.util.Calendar;

public class Calendar_4 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current date: " + cal.getTime());

        // Adding 5 days to the current date
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Date after adding 5 days: " + cal.getTime());

        // Adding 2 months to the current date
        cal.add(Calendar.MONTH, 2);
        System.out.println("Date after adding 2 months: " + cal.getTime());
    }
}
