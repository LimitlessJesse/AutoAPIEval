import java.util.Calendar;

public class Calendar_2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day of Month: " + dayOfMonth);
    }
}
