import java.io.StringReader;
import java.io.IOException;

public class Reader_4 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        
        try {
            boolean isReady = reader.ready();
            System.out.println("Is reader ready: " + isReady);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
