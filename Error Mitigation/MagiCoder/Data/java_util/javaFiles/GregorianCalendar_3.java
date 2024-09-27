import java.util.GregorianCalendar;

public class GregorianCalendar_3 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(GregorianCalendar.DAY_OF_MONTH, 10);
        System.out.println(calendar.getTime());
    }
}
