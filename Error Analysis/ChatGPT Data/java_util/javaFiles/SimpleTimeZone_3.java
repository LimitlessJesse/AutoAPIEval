import java.util.SimpleTimeZone;

public class SimpleTimeZone_3 {
    public static void main(String[] args) {
        SimpleTimeZone timeZone = new SimpleTimeZone(0, "GMT");
        timeZone.setEndRule(10, 1, 0, 0); // Sets the end rule to October, first Sunday, at midnight
    }
}
