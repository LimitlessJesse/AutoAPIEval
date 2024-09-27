import java.util.Calendar;

public class Calendar_2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("Current Date: " + year + "/" + (month + 1) + "/" + day);
    }
}
