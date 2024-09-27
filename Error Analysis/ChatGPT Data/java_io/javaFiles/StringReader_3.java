import java.io.StringReader;
import java.io.IOException;

public class StringReader_3 {
    public static void main(String[] args) {
        try {
            StringReader reader = new StringReader("Hello World");
            reader.skip(6); // Skips the first 6 characters
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c); // Output: World
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
