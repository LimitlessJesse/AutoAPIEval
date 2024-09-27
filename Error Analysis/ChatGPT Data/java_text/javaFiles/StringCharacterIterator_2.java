import java.text.StringCharacterIterator;

public class StringCharacterIterator_2 {
    public static void main(String[] args) {
        String str = "Hello";
        StringCharacterIterator it = new StringCharacterIterator(str);
        char lastChar = it.last();
        System.out.println("Last character: " + lastChar);
    }
}
