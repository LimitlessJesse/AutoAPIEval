import java.util.TimeZone;

public class TimeZone_2 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("Default TimeZone: " + timeZone.getID());
    }
}
