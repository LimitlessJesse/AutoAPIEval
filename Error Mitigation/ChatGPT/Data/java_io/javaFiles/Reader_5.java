import java.io.StringReader;
import java.io.IOException;

public class Reader_5 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        
        try {
            reader.close();
            // Further operations on the reader will throw an IOException
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
