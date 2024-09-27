import java.io.IOException;
import java.io.StringReader;

public class StringReader_4 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        try {
            reader.skip(7); // Skip the first 7 characters
            int data = reader.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
