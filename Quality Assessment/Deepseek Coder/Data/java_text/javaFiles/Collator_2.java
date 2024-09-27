import java.text.Collator;
import java.util.Locale;

public class Collator_2 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(new Locale("en", "US"));
        collator.setStrength(Collator.PRIMARY);
        System.out.println(collator.getStrength());
    }
}
