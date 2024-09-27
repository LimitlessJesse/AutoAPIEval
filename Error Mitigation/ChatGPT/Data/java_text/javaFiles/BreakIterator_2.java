import java.text.BreakIterator;

public class BreakIterator_2 {
    public static void main(String[] args) {
        BreakIterator iterator = BreakIterator.getWordInstance();
        String text = "Hello World";
        iterator.setText(text);
        
        int lastBoundary = iterator.last();
        System.out.println("Last boundary: " + lastBoundary);
    }
}
