import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextLayout;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class LineBreakMeasurer_1 {
    public static void main(String[] args) {
        AttributedString text = new AttributedString("This is a sample text to demonstrate LineBreakMeasurer");
        AttributedCharacterIterator iterator = text.getIterator();
        
        LineBreakMeasurer measurer = new LineBreakMeasurer(iterator, null);
        
        float wrappingWidth = 200.0f;
        TextLayout layout = measurer.nextLayout(wrappingWidth);
        
        System.out.println("Text layout: " + layout);
    }
}
