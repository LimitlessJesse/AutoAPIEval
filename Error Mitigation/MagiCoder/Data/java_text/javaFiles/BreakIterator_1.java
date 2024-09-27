import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_1 {
    public static void main(String[] args) {
        String text = "Hello, world!";
        BreakIterator iterator = BreakIterator.getWordInstance(Locale.US);
        iterator.setText(text);
        int firstBoundary = iterator.first();
        System.out.println("First boundary: " + firstBoundary);
    }
}
