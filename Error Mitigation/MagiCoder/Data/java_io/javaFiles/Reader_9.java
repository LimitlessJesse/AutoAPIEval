import java.io.Reader;
import java.io.StringReader;

public class Reader_9 {
    public static void main(String[] args) {
        try {
            Reader reader = new StringReader("Hello, World!");
            System.out.println(reader.markSupported());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
