import java.text.Collator;
import java.util.Locale;
import java.text.spi.CollatorProvider;

public class CollatorProvider_1 {
    public static void main(String[] args) {
        CollatorProvider provider = new CollatorProvider() {
            @Override
            public Collator getInstance(Locale locale) {
                return Collator.getInstance(locale);
            }
        };
        
        Locale locale = new Locale("en", "US");
        Collator collator = provider.getInstance(locale);
        
        System.out.println(collator.compare("apple", "banana"));
    }
}
