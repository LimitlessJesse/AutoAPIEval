import java.text.StringCharacterIterator;

public class StringCharacterIterator_1 {
    public static void main(String[] args) {
        String str = "Hello";
        StringCharacterIterator sci = new StringCharacterIterator(str);
        char firstChar = sci.first();
        System.out.println("First character: " + firstChar);
    }
}
