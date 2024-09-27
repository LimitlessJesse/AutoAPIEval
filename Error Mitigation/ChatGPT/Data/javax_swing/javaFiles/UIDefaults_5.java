import javax.swing.UIDefaults;
import java.util.Locale;

public class UIDefaults_5 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        Locale newLocale = new Locale("en", "US");
        defaults.setDefaultLocale(newLocale);
    }
}
