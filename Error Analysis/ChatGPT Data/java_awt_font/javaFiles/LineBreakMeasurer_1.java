import java.awt.font.TextLayout;
import java.awt.font.LineBreakMeasurer;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class LineBreakMeasurer_1 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        AttributedCharacterIterator textIterator = attributedString.getIterator();
        
        LineBreakMeasurer lineMeasurer = new LineBreakMeasurer(textIterator, null);
        
        int wrappingWidth = 200;
        TextLayout layout = lineMeasurer.nextLayout(wrappingWidth);
        
        System.out.println("Ascent: " + layout.getAscent());
        System.out.println("Descent: " + layout.getDescent());
        System.out.println("Leading: " + layout.getLeading());
    }
}
