import java.io.PushbackInputStream;
import java.io.IOException;

public class PushbackInputStream_1 {
    public static void main(String[] args) {
        try {
            PushbackInputStream pushbackInputStream = new PushbackInputStream(System.in);
            int data = pushbackInputStream.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
