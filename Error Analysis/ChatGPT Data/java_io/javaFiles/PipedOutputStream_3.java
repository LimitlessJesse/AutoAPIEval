import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_3 {
    public static void main(String[] args) {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            byte[] byteArray = {65, 66, 67, 68, 69}; // A, B, C, D, E in ASCII
            int offset = 1;
            int length = 3;

            pipedOutputStream.write(byteArray, offset, length);

            // Print some output to show usage of the method
            System.out.println("Bytes written from offset " + offset + " with length " + length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
