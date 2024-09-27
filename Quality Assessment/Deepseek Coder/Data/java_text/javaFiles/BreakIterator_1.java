import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_1 {
    public static void main(String[] args) {
        BreakIterator wordIterator = BreakIterator.getWordInstance(Locale.US);
        String text = "Hello, World!";
        wordIterator.setText(text);

        int start = wordIterator.first();
        int end = wordIterator.next();

        while (end!= BreakIterator.DONE) {
            System.out.println(text.substring(start, end));
            start = end;
            end = wordIterator.next();
        }
    }
}
