import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FilterOutputStream_3 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // Not used in this example
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                // This is where the write operation happens
                for (int i = off; i < off + len; i++) {
                    System.out.print((char) b[i]);
                }
            }
        };

        FilterOutputStream filterOutputStream = new FilterOutputStream(outputStream);

        try {
            String message = "Hello, World!";
            byte[] bytes = message.getBytes();
            filterOutputStream.write(bytes, 0, bytes.length);
            filterOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
