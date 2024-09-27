import java.util.SimpleTimeZone;

public class SimpleTimeZone_1 {
    public static void main(String[] args) {
        SimpleTimeZone timeZone = new SimpleTimeZone();
        int startYear = 2022;
        timeZone.setStartYear(startYear);
        System.out.println("Daylight saving time starting year set to: " + startYear);
    }
}
