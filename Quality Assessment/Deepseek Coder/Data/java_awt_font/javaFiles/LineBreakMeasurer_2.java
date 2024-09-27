import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;

public class LineBreakMeasurer_2 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        AttributedCharacterIterator iterator =
                AttributedCharacterIterator.
                        getInstance(text.toCharArray(), 0, text.length(), Locale.getDefault());
        BreakIterator breakIterator = BreakIterator.getWordInstance(Locale.getDefault());
        breakIterator.setText(text);

        LineBreakMeasurer measurer = new LineBreakMeasurer(iterator, breakIterator);
        measurer.setPosition(0);

        float limit = 100;
        int offset = measurer.nextOffset(limit);

        System.out.println("Next offset: " + offset);
    }
}
