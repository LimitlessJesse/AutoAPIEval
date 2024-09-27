import java.text.StringCharacterIterator;

public class StringCharacterIterator_4 {
    public static void main(String[] args) {
        String text = "Hello";
        StringCharacterIterator iterator = new StringCharacterIterator(text);
        
        char nextChar = iterator.next();
        System.out.println("Next character: " + nextChar);
    }
}
