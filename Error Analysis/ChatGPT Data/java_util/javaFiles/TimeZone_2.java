import java.util.TimeZone;

public class TimeZone_2 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        String id = timeZone.getID();
        System.out.println("Time Zone ID: " + id);
    }
}
