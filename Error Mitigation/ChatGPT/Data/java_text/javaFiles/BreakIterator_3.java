import java.text.BreakIterator;

public class BreakIterator_3 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        BreakIterator iterator = BreakIterator.getWordInstance();
        iterator.setText(text);
        
        int boundary = iterator.first();
        while (boundary != BreakIterator.DONE) {
            int nextBoundary = iterator.next();
            System.out.println("Next boundary index: " + nextBoundary);
            boundary = nextBoundary;
        }
    }
}
