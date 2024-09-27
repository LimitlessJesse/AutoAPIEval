import java.util.Locale;

public class Locale_14 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        int hashCode = locale.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
