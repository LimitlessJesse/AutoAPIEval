import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextLayout;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class LineBreakMeasurer_4 {
    public static void main(String[] args) {
        AttributedString text = new AttributedString("This is a sample text for LineBreakMeasurer");
        AttributedCharacterIterator iterator = text.getIterator();
        
        LineBreakMeasurer measurer = new LineBreakMeasurer(iterator, null);
        
        TextLayout layout = measurer.nextLayout(200, 0, false);
        System.out.println(layout.getBounds());
    }
}
