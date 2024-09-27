import java.text.StringCharacterIterator;

public class StringCharacterIterator_1 {
    public static void main(String[] args) {
        String text = "Hello";
        StringCharacterIterator iterator = new StringCharacterIterator(text);
        
        char firstChar = iterator.first();
        System.out.println("First character: " + firstChar);
    }
}
