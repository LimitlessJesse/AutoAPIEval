import java.util.TimeZone;

public class TimeZone_4 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT+3");
        int rawOffset = timeZone.getRawOffset();
        System.out.println("Raw offset: " + rawOffset);
    }
}
