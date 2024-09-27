import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_3 {
    public static void main(String[] args) {
        String text = "Hello, world! This is a test.";
        BreakIterator iterator = BreakIterator.getWordInstance(Locale.US);
        iterator.setText(text);
        int lastBoundary = iterator.last();
        System.out.println("The last boundary is at index: " + lastBoundary);
    }
}
