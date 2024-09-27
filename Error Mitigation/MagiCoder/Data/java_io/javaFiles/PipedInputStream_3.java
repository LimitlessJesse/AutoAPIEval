import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_3 {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Write data to the output stream
            String data = "Hello, World!";
            pos.write(data.getBytes());

            // Read data from the input stream
            byte[] buffer = new byte[1024];
            int bytesRead = pis.read(buffer, 0, buffer.length);

            // Print the data
            System.out.println(new String(buffer, 0, bytesRead));

            // Close the streams
            pos.close();
            pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
