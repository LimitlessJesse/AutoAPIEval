import java.util.Locale;

public class Locale_1 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        String country = locale.getCountry();
        System.out.println("Country/Region Code: " + country);
    }
}
