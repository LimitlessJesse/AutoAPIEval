import javax.activation.DataHandler;
import javax.activation.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class DataHandler_3 {
    public static void main(String[] args) {
        // Create a DataSource
        DataSource dataSource = new DataSource() {
            @Override
            public InputStream getInputStream() {
                return new ByteArrayInputStream("Hello, World!".getBytes());
            }

            @Override
            public OutputStream getOutputStream() {
                throw new UnsupportedOperationException();
            }
        };

        // Create a DataHandler using the DataSource
        DataHandler dataHandler = new DataHandler(dataSource);

        // Get the DataSource from the DataHandler
        DataSource result = dataHandler.getDataSource();

        // Print the result
        System.out.println(result);
    }
}
