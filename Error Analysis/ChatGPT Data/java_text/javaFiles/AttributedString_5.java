import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.Map;

public class AttributedString_5 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Example Text");
        Map<AttributedCharacterIterator.Attribute, ?> attributes = null;
        int beginIndex = 0;
        int endIndex = 5;
        
        attributedString.addAttributes(attributes, beginIndex, endIndex);
    }
}
