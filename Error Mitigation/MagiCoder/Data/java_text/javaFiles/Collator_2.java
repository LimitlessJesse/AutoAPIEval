import java.text.Collator;
import java.util.Locale;

public class Collator_2 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(new Locale("en", "US"));
        String s1 = "Hello";
        String s2 = "World";
        int result = collator.compare(s1, s2);
        System.out.println(result);
    }
}
