import java.text.StringCharacterIterator;

public class StringCharacterIterator_2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringCharacterIterator iterator = new StringCharacterIterator(str);
        iterator.setIndex(str.length());
        char lastChar = iterator.previous();
        System.out.println("The last character is: " + lastChar);
    }
}
