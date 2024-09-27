import java.text.StringCharacterIterator;

public class StringCharacterIterator_3 {
    public static void main(String[] args) {
        String text = "Hello";
        StringCharacterIterator iterator = new StringCharacterIterator(text);
        
        char currentChar = iterator.current();
        System.out.println("Current character: " + currentChar);
    }
}
