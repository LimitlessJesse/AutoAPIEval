import java.util.SimpleTimeZone;

public class SimpleTimeZone_5 {
    public static void main(String[] args) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "GMT");
        int rawOffset = simpleTimeZone.getRawOffset();
        System.out.println("Raw offset: " + rawOffset);
    }
}
