import java.text.AttributedString;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;

public class AttributedString_3 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Example text");
        
        Map<AttributedCharacterIterator.Attribute, Object> attributes = new HashMap<>();
        attributes.put(AttributedCharacterIterator.Attribute.FONT, "Arial");
        
        attributedString.addAttributes(attributes, 0, 7);
    }
}
