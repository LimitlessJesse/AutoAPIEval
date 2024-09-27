import java.text.Collator;
import java.util.Locale;

public class Collator_5 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(new Locale("en", "US"));
        String str = "a\u0301";
        int decomposition = collator.getDecomposition(str.charAt(0));
        System.out.println(decomposition);
    }
}
