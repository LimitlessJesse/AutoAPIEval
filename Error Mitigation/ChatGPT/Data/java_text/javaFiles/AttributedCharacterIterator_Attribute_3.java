import java.text.AttributedCharacterIterator;

public class AttributedCharacterIterator_Attribute_3 {
    public static void main(String[] args) {
        AttributedCharacterIterator.Attribute attribute = AttributedCharacterIterator.Attribute.LANGUAGE;
        int hashCode = attribute.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
