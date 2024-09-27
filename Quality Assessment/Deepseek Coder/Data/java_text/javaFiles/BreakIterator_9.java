import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_9 {
    public static void main(String[] args) {
        BreakIterator wordIterator = BreakIterator.getWordInstance(Locale.US);
        String text = "Hello, World!";
        wordIterator.setText(text);
        
        int start = wordIterator.first();
        int end = text.length();
        
        while (start!= BreakIterator.DONE && end!= BreakIterator.DONE) {
            System.out.println(text.substring(start, end));
            start = wordIterator.next(end);
            end = wordIterator.next();
        }
    }
}
