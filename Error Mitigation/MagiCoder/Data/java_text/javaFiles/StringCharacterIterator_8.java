import java.text.StringCharacterIterator;

public class StringCharacterIterator_8 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello, World!");
        int endIndex = iterator.getEndIndex();
        System.out.println("The end index is: " + endIndex);
    }
}
