import java.io.StringReader;
import java.io.IOException;

public class StringReader_3 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        
        try {
            boolean isReady = reader.ready();
            System.out.println("Is the stream ready to be read? " + isReady);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
