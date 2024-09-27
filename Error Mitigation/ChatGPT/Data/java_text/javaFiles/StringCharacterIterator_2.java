import java.text.StringCharacterIterator;

public class StringCharacterIterator_2 {
    public static void main(String[] args) {
        String text = "Hello";
        StringCharacterIterator iterator = new StringCharacterIterator(text);
        
        char lastChar = iterator.last();
        System.out.println("Last character: " + lastChar);
    }
}
