import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class AttributedString_5 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Example text");
        AttributedCharacterIterator.Attribute[] attributes = {AttributedCharacterIterator.Attribute.LANGUAGE};
        AttributedCharacterIterator iterator = attributedString.getIterator(attributes);
        System.out.println(iterator.allValidAttributes());
    }
}
