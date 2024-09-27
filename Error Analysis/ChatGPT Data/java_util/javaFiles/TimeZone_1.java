import java.util.TimeZone;

public class TimeZone_1 {
    public static void main(String[] args) {
        // Get the default time zone
        TimeZone defaultTimeZone = TimeZone.getDefault();

        // Get and print the display name of the default time zone
        String displayName = defaultTimeZone.getDisplayName();
        System.out.println("Default Time Zone Display Name: " + displayName);
    }
}
