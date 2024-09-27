import java.text.StringCharacterIterator;

public class StringCharacterIterator_10 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello, World!");
        StringCharacterIterator clone = (StringCharacterIterator) iterator.clone();

        System.out.println("Original iterator: " + iterator);
        System.out.println("Cloned iterator: " + clone);
    }
}
