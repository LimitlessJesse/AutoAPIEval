import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.activation.DataHandler;
import javax.activation.DataSource;

public class DataHandler_5 {
    public static void main(String[] args) {
        try {
            // Create a DataHandler
            DataHandler dataHandler = new DataHandler(new DataSource() {
                @Override
                public InputStream getInputStream() throws IOException {
                    return new ByteArrayInputStream("Hello, World!".getBytes());
                }

                @Override
                public OutputStream getOutputStream() throws IOException {
                    return new ByteArrayOutputStream();
                }

                @Override
                public String getContentType() {
                    return "text/plain";
                }

                @Override
                public String getName() {
                    return "Hello";
                }
            });

            // Write the data to an output stream
            dataHandler.writeTo(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
