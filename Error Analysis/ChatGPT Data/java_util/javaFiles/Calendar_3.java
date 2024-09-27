import java.util.Calendar;

public class Calendar_3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Initial calendar value: " + calendar.getTime());

        calendar.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Updated calendar value: " + calendar.getTime());
    }
}
