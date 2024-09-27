import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class AttributedString_2 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Example text");
        AttributedCharacterIterator.Attribute attribute = AttributedCharacterIterator.Attribute.LANGUAGE;
        Object value = "English";
        int beginIndex = 0;
        int endIndex = 7;
        
        attributedString.addAttribute(attribute, value, beginIndex, endIndex);
    }
}
