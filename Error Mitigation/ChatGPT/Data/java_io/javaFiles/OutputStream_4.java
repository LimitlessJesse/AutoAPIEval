import java.io.OutputStream;
import java.io.IOException;

public class OutputStream_4 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // implementation of write method
            }

            @Override
            public void close() throws IOException {
                // implementation of close method
                System.out.println("Output stream closed");
            }
        };

        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
