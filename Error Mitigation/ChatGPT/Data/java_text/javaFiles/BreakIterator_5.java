import java.text.BreakIterator;

public class BreakIterator_5 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        BreakIterator iterator = BreakIterator.getCharacterInstance();
        iterator.setText(text);
        
        int offset = 5;
        int boundary = iterator.following(offset);
        
        System.out.println("First boundary after offset " + offset + ": " + boundary);
    }
}
