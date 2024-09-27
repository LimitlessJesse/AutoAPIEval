import java.io.IOException;
import java.io.PipedInputStream;

public class PipedInputStream_2 {
    public static void main(String[] args) {
        try {
            PipedInputStream input = new PipedInputStream();
            int data = input.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
