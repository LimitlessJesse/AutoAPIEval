import java.util.Locale;

public class Locale_2 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        String displayCountry = locale.getDisplayCountry();
        System.out.println("Display Country: " + displayCountry);
    }
}
