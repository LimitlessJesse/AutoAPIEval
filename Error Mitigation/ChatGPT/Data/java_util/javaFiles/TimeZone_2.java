import java.util.TimeZone;

public class TimeZone_2 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        long date = System.currentTimeMillis();
        int offset = timeZone.getOffset(date);
        System.out.println("Offset from UTC at date " + date + " is: " + offset + " milliseconds");
    }
}
