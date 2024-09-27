import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;
import java.util.Locale;

public class BreakIteratorProvider_4 {
    public static void main(String[] args) {
        BreakIteratorProvider provider = new BreakIteratorProvider() {
            @Override
            public BreakIterator getSentenceInstance(Locale locale) {
                if (locale == null) {
                    throw new NullPointerException("Locale cannot be null");
                }
                // Implement logic to return BreakIterator for sentence breaks based on the locale
                return BreakIterator.getSentenceInstance(locale);
            }
        };
        
        Locale locale = new Locale("en", "US");
        BreakIterator sentenceIterator = provider.getSentenceInstance(locale);
        // Use the sentenceIterator for sentence breaking logic
    }
}
