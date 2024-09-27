import java.text.StringCharacterIterator;

public class StringCharacterIterator_11 {
    public static void main(String[] args) {
        StringCharacterIterator iterator1 = new StringCharacterIterator("Hello");
        StringCharacterIterator iterator2 = new StringCharacterIterator("Hello");
        StringCharacterIterator iterator3 = new StringCharacterIterator("World");

        // Testing equals method
        System.out.println(iterator1.equals(iterator2)); // true
        System.out.println(iterator1.equals(iterator3)); // false
    }
}
