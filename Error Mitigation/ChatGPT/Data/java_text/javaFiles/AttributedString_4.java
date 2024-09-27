import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class AttributedString_4 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Example text");
        AttributedCharacterIterator iterator = attributedString.getIterator();
        
        // Accessing text and its attributes using the iterator
        for(char c = iterator.first(); c != AttributedCharacterIterator.DONE; c = iterator.next()) {
            System.out.print(c);
        }
    }
}
