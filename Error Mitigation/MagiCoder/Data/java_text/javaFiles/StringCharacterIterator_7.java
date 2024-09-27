import java.text.StringCharacterIterator;

public class StringCharacterIterator_7 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello, World!");
        int beginIndex = iterator.getBeginIndex();
        System.out.println("Begin index: " + beginIndex);
    }
}
