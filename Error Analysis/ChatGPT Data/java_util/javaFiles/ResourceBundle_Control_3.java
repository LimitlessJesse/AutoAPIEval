import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Control_3 {
    public static void main(String[] args) {
        List<Locale> locales = ResourceBundle.Control.getControl(ResourceBundle.Control.FORMAT_DEFAULT).getCandidateLocales("messages", Locale.ENGLISH);
        
        System.out.println("Candidate Locales:");
        for (Locale locale : locales) {
            System.out.println(locale.toString());
        }
    }
}
