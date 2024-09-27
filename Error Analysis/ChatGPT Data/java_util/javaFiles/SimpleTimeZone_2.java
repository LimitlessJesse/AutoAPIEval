import java.util.SimpleTimeZone;

public class SimpleTimeZone_2 {
    public static void main(String[] args) {
        SimpleTimeZone timeZone = new SimpleTimeZone(0, "GMT");
        timeZone.setStartRule(1, 1, 0, 0); // Set the start rule for Daylight Saving Time
    }
}
