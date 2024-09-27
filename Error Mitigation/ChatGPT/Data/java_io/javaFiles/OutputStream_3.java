import java.io.OutputStream;
import java.io.IOException;

public class OutputStream_3 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // implementation of write method
            }

            @Override
            public void flush() throws IOException {
                // implementation of flush method
                System.out.println("Flushed the output stream");
            }
        };

        try {
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
