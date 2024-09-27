import java.text.StringCharacterIterator;

public class StringCharacterIterator_3 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello, World!");
        char currentChar = iterator.current();
        System.out.println(currentChar);
    }
}
