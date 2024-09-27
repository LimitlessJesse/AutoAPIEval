import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_3 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    // Implementation not needed for this example
                }

                @Override
                public void write(byte[] b, int off, int len) throws IOException {
                    // Implementation of the write method
                    // Here you can write your logic to write the bytes to the output stream
                    // For example, you can write them to a file or to a network connection
                }
            };

            byte[] data = {1, 2, 3, 4, 5};
            outputStream.write(data, 1, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
