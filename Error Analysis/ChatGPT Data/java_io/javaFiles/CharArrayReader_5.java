import java.io.CharArrayReader;

public class CharArrayReader_5 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        CharArrayReader reader = new CharArrayReader(charArray);
        
        // Mark the current position of the reader with a limit of 3 characters
        reader.mark(3);
        
        // Code to use the reader goes here
        
    }
}
