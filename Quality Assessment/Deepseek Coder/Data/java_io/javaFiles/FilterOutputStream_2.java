import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FilterOutputStream_2 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // Not used in this example
            }

            @Override
            public void write(byte[] b) throws IOException {
                // This is where we use the write(byte[] b) method
                for (byte value : b) {
                    System.out.print((char) value);
                }
            }
        };

        FilterOutputStream filterOutputStream = new FilterOutputStream(outputStream);

        String text = "Hello, World!";
        byte[] bytes = text.getBytes();

        try {
            filterOutputStream.write(bytes);
            filterOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
