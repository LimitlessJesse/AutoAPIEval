import java.io.StringBufferInputStream;
import java.io.IOException;

public class StringBufferInputStream_4 {
    public static void main(String[] args) {
        StringBufferInputStream inputStream = new StringBufferInputStream("Hello World");
        try {
            inputStream.skip(6); // Skip the first 6 characters
            int data = inputStream.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
