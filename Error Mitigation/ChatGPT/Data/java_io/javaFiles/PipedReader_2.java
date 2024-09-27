import java.io.IOException;
import java.io.PipedReader;

public class PipedReader_2 {
    public static void main(String[] args) {
        try {
            PipedReader reader = new PipedReader();
            int data = reader.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
