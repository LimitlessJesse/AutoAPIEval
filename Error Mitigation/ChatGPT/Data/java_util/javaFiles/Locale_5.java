import java.util.Locale;

public class Locale_5 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        String displayName = locale.getDisplayName();
        System.out.println("Display Name: " + displayName);
    }
}
