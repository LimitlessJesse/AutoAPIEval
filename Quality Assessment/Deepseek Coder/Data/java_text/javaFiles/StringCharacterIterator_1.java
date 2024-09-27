import java.text.StringCharacterIterator;

public class StringCharacterIterator_1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringCharacterIterator iterator = new StringCharacterIterator(str);
        char firstChar = iterator.first();
        System.out.println("The first character is: " + firstChar);
    }
}
