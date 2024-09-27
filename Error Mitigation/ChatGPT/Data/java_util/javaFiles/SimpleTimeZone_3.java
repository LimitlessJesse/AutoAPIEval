import java.util.SimpleTimeZone;

public class SimpleTimeZone_3 {
    public static void main(String[] args) {
        SimpleTimeZone timeZone = new SimpleTimeZone();
        timeZone.setStartYear(2022);
        System.out.println("Daylight saving time starting year set to: " + timeZone.getStartYear());
    }
}
