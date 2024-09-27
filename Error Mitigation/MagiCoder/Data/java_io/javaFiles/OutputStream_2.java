import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_2 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    // Implementation not needed for this example
                }

                @Override
                public void write(byte[] b) throws IOException {
                    // Implementation of write(byte[] b) method
                    for (byte b1 : b) {
                        System.out.print((char) b1);
                    }
                }
            };

            // Test the write(byte[] b) method
            outputStream.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
