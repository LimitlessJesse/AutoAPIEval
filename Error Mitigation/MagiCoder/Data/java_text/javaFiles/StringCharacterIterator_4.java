import java.text.StringCharacterIterator;

public class StringCharacterIterator_4 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello, World!");
        char c;
        while ((c = iterator.next())!= StringCharacterIterator.DONE) {
            System.out.println(c);
        }
    }
}
