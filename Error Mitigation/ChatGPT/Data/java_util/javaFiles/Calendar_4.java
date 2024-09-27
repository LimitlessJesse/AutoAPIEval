import java.util.Calendar;

public class Calendar_4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int maxMonth = calendar.getActualMaximum(Calendar.MONTH);
        System.out.println("Maximum value for MONTH field: " + maxMonth);
    }
}
