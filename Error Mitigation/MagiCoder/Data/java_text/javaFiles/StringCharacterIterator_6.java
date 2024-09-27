import java.text.StringCharacterIterator;

public class StringCharacterIterator_6 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello, World!");
        int position = 5;
        char character = iterator.setIndex(position);
        System.out.println("Character at position " + position + " is: " + character);
    }
}
