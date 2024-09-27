import java.text.BreakIterator;

public class BreakIterator_4 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        BreakIterator iterator = BreakIterator.getCharacterInstance();
        iterator.setText(text);
        
        int current = iterator.first();
        int previous = iterator.previous();
        
        System.out.println("Current boundary: " + current);
        System.out.println("Previous boundary: " + previous);
    }
}
