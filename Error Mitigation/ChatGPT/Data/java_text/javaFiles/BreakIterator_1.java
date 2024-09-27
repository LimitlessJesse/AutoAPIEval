import java.text.BreakIterator;

public class BreakIterator_1 {
    public static void main(String[] args) {
        BreakIterator iterator = BreakIterator.getCharacterInstance();
        String text = "Hello World";
        iterator.setText(text);
        int firstBoundary = iterator.first();
        System.out.println("First boundary: " + firstBoundary);
    }
}
