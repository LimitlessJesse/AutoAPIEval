import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_4 {
    public static void main(String[] args) {
        // Create a FilterOutputStream object
        FilterOutputStream filterOutputStream = new FilterOutputStream() {
            @Override
            public void write(int b) throws IOException {
                // Implementation of write method
            }

            @Override
            public void flush() throws IOException {
                // Implementation of flush method
                super.flush();
            }
        };

        try {
            // Flush the output stream
            filterOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
