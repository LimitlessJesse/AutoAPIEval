import java.text.StringCharacterIterator;

public class StringCharacterIterator_5 {
    public static void main(String[] args) {
        String text = "Hello";
        StringCharacterIterator iterator = new StringCharacterIterator(text);
        
        char previousChar = iterator.previous();
        System.out.println("Previous character: " + previousChar);
    }
}
