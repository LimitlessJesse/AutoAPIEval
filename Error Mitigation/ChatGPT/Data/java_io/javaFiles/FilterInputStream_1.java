import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;

public class FilterInputStream_1 {
    public static void main(String[] args) {
        // Create a FilterInputStream object
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0; // Implement your read logic here
            }
        };
        
        FilterInputStream filterInputStream = new FilterInputStream(inputStream) {
            @Override
            public int read() throws IOException {
                return super.read(); // Calls the read method from the InputStream
            }
        };
        
        try {
            int data = filterInputStream.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
