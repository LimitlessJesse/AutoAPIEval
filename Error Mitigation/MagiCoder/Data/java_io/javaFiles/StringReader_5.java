import java.io.IOException;
import java.io.StringReader;

public class StringReader_5 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        try {
            while (reader.ready()) {
                System.out.print((char) reader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
