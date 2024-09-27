import java.io.PipedReader;
import java.io.IOException;

public class PipedReader_2 {
    public static void main(String[] args) {
        try {
            PipedReader reader = new PipedReader();
            reader.write('A');
            int data = reader.read();
            System.out.println("Read character: " + (char)data);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
