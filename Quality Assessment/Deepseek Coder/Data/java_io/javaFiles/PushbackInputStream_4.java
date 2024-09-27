import java.io.PushbackInputStream;
import java.io.IOException;

public class PushbackInputStream_4 {
    public static void main(String[] args) {
        PushbackInputStream input = new PushbackInputStream(System.in);
        int b;
        try {
            while ((b = input.read())!= -1) {
                if (b == 'A' || b == 'B' || b == 'C') {
                    input.unread(b);
                    int b2 = input.read();
                    System.out.println("Read: " + (char) b2);
                } else {
                    System.out.println("Read: " + (char) b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
