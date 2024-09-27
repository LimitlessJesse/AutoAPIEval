import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextLayout;
import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.BreakIterator;

public class LineBreakMeasurer_1 {
    public static void main(String[] args) {
        String text = "Hello, world!";
        AttributedString attrStr = new AttributedString(text);
        attrStr.addAttribute(TextAttribute.FONT, new java.awt.Font("Arial", Font.PLAIN, 12));
        AttributedCharacterIterator charIter = attrStr.getIterator();
        BreakIterator wordIter = BreakIterator.getWordInstance();
        wordIter.setText(charIter);
        LineBreakMeasurer measurer = new LineBreakMeasurer(charIter, wordIter, 0, text.length());
        TextLayout layout = measurer.nextLayout(Float.MAX_VALUE);
        int position = measurer.getPosition();
        System.out.println("Position: " + position);
    }
}
