import java.text.AttributedString;
import java.text.AttributedCharacterIterator;

public class AttributedString_4 {
    public static void main(String[] args) {
        AttributedString attributedString = new AttributedString("Hello World");
        AttributedCharacterIterator iterator = attributedString.getIterator();
        
        int start = iterator.getBeginIndex();
        int end = iterator.getEndIndex();
        for (int i = start; i < end; i++) {
            iterator.setIndex(i);
            System.out.println("Character: " + iterator.current());
        }
    }
}
