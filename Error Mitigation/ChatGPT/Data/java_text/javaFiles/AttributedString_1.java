import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class AttributedString_1 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Example text");
        AttributedCharacterIterator.Attribute attribute = AttributedCharacterIterator.Attribute.LANGUAGE;
        Object value = "English";
        
        attributedString.addAttribute(attribute, value);
    }
}
