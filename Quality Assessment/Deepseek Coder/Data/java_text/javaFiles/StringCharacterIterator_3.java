import java.text.StringCharacterIterator;

public class StringCharacterIterator_3 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringCharacterIterator iterator = new StringCharacterIterator(str);
        
        for (char c = iterator.first(); c!= CharacterIterator.DONE; c = iterator.next()) {
            System.out.println(c);
        }
    }
}
