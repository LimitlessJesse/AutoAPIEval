import java.text.StringCharacterIterator;

public class StringCharacterIterator_2 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello");
        char lastChar = iterator.last();
        System.out.println("The last character is: " + lastChar);
    }
}
