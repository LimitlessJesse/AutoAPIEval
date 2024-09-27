import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStream_4 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // Implementation of write method
            }
        };

        FilterOutputStream filterOutputStream = new FilterOutputStream(outputStream) {
            @Override
            public void flush() throws IOException {
                // Implementation of flush method
            }
        };

        try {
            filterOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
