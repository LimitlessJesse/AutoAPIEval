import java.util.TimeZone;
import java.util.Locale;
import java.util.spi.TimeZoneNameProvider;

public class TimeZoneNameProvider_1 {
    public static void main(String[] args) {
        TimeZoneNameProvider provider = TimeZoneNameProvider.getTimeZoneNameProvider();
        String timeZoneID = "GMT";
        boolean daylight = false;
        int style = TimeZone.LONG;
        Locale locale = Locale.US;
        
        String displayName = provider.getDisplayName(timeZoneID, daylight, style, locale);
        System.out.println("Time Zone Display Name: " + displayName);
    }
}
