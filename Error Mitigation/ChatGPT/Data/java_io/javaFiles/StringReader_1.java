import java.io.IOException;
import java.io.StringReader;

public class StringReader_1 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        try {
            int charRead = reader.read();
            System.out.println((char) charRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
