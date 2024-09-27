import java.util.TimeZone;

public class TimeZone_3 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        long date = System.currentTimeMillis();
        int offset = timeZone.getOffset(date);
        System.out.println("Offset: " + offset);
    }
}
