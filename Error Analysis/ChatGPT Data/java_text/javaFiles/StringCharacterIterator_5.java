import java.text.StringCharacterIterator;

public class StringCharacterIterator_5 {
    public static void main(String[] args) {
        String str = "Hello";
        StringCharacterIterator sci = new StringCharacterIterator(str);
        
        char current = sci.current();
        System.out.println("Current character: " + current);
        
        char prev = sci.previous();
        System.out.println("Previous character: " + prev);
    }
}
