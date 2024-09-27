import java.text.AttributedCharacterIterator;

public class AttributedCharacterIterator_Attribute_1 {
    public static void main(String[] args) {
        AttributedCharacterIterator.Attribute attribute = AttributedCharacterIterator.Attribute.LANGUAGE;
        String attributeName = attribute.getName();
        System.out.println("Attribute name: " + attributeName);
    }
}
