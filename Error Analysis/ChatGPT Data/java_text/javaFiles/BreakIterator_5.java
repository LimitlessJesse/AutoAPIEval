import java.text.BreakIterator;

public class BreakIterator_5 {
    public static void main(String[] args) {
        String text = "Hello World";
        BreakIterator iterator = BreakIterator.getCharacterInstance();
        iterator.setText(text);

        int offset = 3;
        int nextIndex = iterator.following(offset);

        System.out.println("Next character index after offset " + offset + ": " + nextIndex);
    }
}
