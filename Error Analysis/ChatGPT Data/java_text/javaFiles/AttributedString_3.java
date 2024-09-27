import java.text.AttributedString;
import java.text.AttributedCharacterIterator;

public class AttributedString_3 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Hello World");
        AttributedCharacterIterator.Attribute attribute = AttributedCharacterIterator.Attribute.LANGUAGE;
        Object value = "English";
        int beginIndex = 0;
        int endIndex = 5;
        attributedString.addAttribute(attribute, value, beginIndex, endIndex);
    }
}
