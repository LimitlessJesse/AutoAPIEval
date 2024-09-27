import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStream_1 {
    public static void main(String[] args) {
        try {
            PushbackInputStream pushbackInputStream = new PushbackInputStream(System.in);
            int data = pushbackInputStream.read();
            if (data!= -1) {
                System.out.println("Read byte: " + data);
            } else {
                System.out.println("End of stream reached");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
