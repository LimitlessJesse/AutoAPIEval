import java.util.TimeZone;

public class TimeZone_1 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        String displayName = timeZone.getDisplayName(true, TimeZone.LONG);
        System.out.println("Display Name: " + displayName);
    }
}
