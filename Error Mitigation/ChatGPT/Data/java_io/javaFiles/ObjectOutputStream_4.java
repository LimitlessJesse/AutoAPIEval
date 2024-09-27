import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class ObjectOutputStream_4 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    // implementation of write method
                }
            };
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            
            // Perform some write operations
            
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
