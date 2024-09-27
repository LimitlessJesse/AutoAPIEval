import java.util.Locale;
import java.util.TimeZone;
import java.util.spi.TimeZoneNameProvider;

public class TimeZoneNameProvider_2 {
    public static void main(String[] args) {
        TimeZoneNameProvider provider = TimeZoneNameProvider.getTimeZoneNameProvider();
        String timeZoneID = "America/Los_Angeles";
        int style = TimeZone.LONG;
        Locale locale = Locale.US;
        
        String genericDisplayName = provider.getGenericDisplayName(timeZoneID, style, locale);
        System.out.println("Generic Display Name: " + genericDisplayName);
    }
}
