import java.text.StringCharacterIterator;

public class StringCharacterIterator_5 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello, World!", 0, "Hello, World!".length());
        char previousChar = iterator.previous();
        System.out.println(previousChar);
    }
}
