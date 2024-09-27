import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_5 {
    public static void main(String[] args) {
        try {
            char[] charArray = {'a', 'b', 'c', 'd', 'e'};
            CharArrayReader reader = new CharArrayReader(charArray);
            
            // Mark the present position in the stream
            reader.mark(3);
            
            // Read and print characters
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            
            // Reset the stream to the marked position
            reader.reset();
            
            // Read and print characters again
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
