import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_2 {
    public static void main(String[] args) {
        String text = "Hello, world! This is a test.";
        BreakIterator wordIterator = BreakIterator.getWordInstance(Locale.US);
        wordIterator.setText(text);

        int start = wordIterator.first();
        for (int end = wordIterator.next(); end!= BreakIterator.DONE; start = end, end = wordIterator.next()) {
            System.out.println(text.substring(start, end));
        }
    }
}
