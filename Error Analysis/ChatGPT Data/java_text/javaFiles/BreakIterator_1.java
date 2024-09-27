import java.text.BreakIterator;

public class BreakIterator_1 {
    public static void main(String[] args) {
        BreakIterator iterator = BreakIterator.getWordInstance();
        String text = "Hello World";
        iterator.setText(text);
        
        int first = iterator.first();
        System.out.println("First position: " + first);
    }
}
