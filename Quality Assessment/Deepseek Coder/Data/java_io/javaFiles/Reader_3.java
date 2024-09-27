import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Reader_3 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        try (Reader reader = new StringReader(str)) {
            System.out.println("Before skipping: " + reader.read());
            reader.skip(5);  // Skip the first 5 characters
            System.out.println("After skipping: " + reader.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
