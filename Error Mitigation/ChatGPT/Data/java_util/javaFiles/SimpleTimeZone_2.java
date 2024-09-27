import java.util.SimpleTimeZone;

public class SimpleTimeZone_2 {
    public static void main(String[] args) {
        SimpleTimeZone timeZone = new SimpleTimeZone(0, "GMT");
        timeZone.setEndRule(10, -1, 1, 2*60*60*1000);
        System.out.println("Daylight saving time end rule set successfully.");
    }
}
