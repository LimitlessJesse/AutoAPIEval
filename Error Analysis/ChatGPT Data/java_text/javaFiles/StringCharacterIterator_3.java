import java.text.StringCharacterIterator;

public class StringCharacterIterator_3 {
    public static void main(String[] args) {
        String text = "Hello";
        StringCharacterIterator iterator = new StringCharacterIterator(text);

        for(char c = iterator.first(); c != StringCharacterIterator.DONE; c = iterator.next()) {
            System.out.println(iterator.current());
        }
    }
}
