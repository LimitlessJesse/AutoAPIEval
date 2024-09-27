import java.util.GregorianCalendar;

public class GregorianCalendar_4 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = 2024;
        boolean isLeapYear = calendar.isLeapYear(year);
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
