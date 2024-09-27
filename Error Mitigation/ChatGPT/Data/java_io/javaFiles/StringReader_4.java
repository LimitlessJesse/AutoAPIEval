import java.io.StringReader;
import java.io.IOException;

public class StringReader_4 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        
        try {
            reader.close();
            System.out.println("Stream closed successfully");
        } catch (IOException e) {
            System.out.println("Error closing stream: " + e.getMessage());
        }
    }
}
