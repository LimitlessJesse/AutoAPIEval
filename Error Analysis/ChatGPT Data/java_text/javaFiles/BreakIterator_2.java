import java.text.BreakIterator;

public class BreakIterator_2 {
    public static void main(String[] args) {
        String text = "This is a sample text. Showing how to use BreakIterator.";
        BreakIterator boundary = BreakIterator.getSentenceInstance();
        boundary.setText(text);
        
        int lastPosition = boundary.first();
        while (boundary.next() != BreakIterator.DONE) {
            lastPosition = boundary.current();
        }
        
        System.out.println("Last position: " + lastPosition);
    }
}
