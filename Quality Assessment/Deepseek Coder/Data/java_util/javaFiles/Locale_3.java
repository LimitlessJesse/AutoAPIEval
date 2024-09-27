import java.util.Locale;

public class Locale_3 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        System.out.println("Country: " + country);
    }
}
