import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextLayout;
import java.text.AttributedCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;

public class LineBreakMeasurer_1 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        BreakIterator breakIterator = BreakIterator.getCharacterInstance(Locale.US);
        breakIterator.setText(text);

        AttributedCharacterIterator charIterator = new AttributedCharacterIterator(text);
        LineBreakMeasurer measurer = new LineBreakMeasurer(charIterator, null, true, Locale.US);

        while (measurer.getPosition() < text.length()) {
            TextLayout layout = measurer.nextLayout(100);
            int position = measurer.getPosition();
            System.out.println("Position: " + position);
        }
    }
}
