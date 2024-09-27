import java.text.StringCharacterIterator;

public class StringCharacterIterator_12 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello");
        int hashCode = iterator.hashCode();
        System.out.println("Hashcode: " + hashCode);
    }
}
