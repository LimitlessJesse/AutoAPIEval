import java.util.GregorianCalendar;

public class GregorianCalendar_4 {
    
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
    }
    
    public static boolean isLeapYear(int year) {
        GregorianCalendar calendar = new GregorianCalendar();
        return calendar.isLeapYear(year);
    }
}
