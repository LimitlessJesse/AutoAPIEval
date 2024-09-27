import java.io.CharArrayReader;

public class CharArrayReader_4 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        CharArrayReader reader = new CharArrayReader(charArray);
        
        boolean markSupported = reader.markSupported();
        System.out.println("markSupported: " + markSupported);
    }
}
