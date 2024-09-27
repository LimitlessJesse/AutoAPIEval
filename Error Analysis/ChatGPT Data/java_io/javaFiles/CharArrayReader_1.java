import java.io.CharArrayReader;

public class CharArrayReader_1 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        CharArrayReader reader = new CharArrayReader(charArray); 
        
        try {
            int charRead = reader.read();
            System.out.println((char) charRead);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
