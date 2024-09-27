import java.text.StringCharacterIterator;

public class StringCharacterIterator_5 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringCharacterIterator iterator = new StringCharacterIterator(str);

        System.out.println("Characters in reverse order:");
        char ch = iterator.setIndex(str.length());
        while (Character.isValidCodePoint(ch)) {
            System.out.println(ch);
            ch = iterator.previous();
        }
    }
}
