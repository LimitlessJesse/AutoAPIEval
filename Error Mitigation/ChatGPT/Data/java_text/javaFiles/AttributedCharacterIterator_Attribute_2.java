import java.text.AttributedCharacterIterator;

public class AttributedCharacterIterator_Attribute_2 {
    public static void main(String[] args) {
        AttributedCharacterIterator.Attribute attr1 = AttributedCharacterIterator.Attribute.LANGUAGE;
        AttributedCharacterIterator.Attribute attr2 = AttributedCharacterIterator.Attribute.LANGUAGE;

        System.out.println(attr1.equals(attr2)); // Output: true
    }
}
