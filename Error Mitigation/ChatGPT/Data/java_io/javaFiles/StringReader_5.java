import java.io.StringReader;
import java.io.IOException;

public class StringReader_5 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        
        try {
            long skipped = reader.skip(6);
            System.out.println("Skipped characters: " + skipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
