import javax.activation.DataHandler;
import java.io.IOException;
import java.io.OutputStream;

public class DataHandler_4 {
    public static void main(String[] args) {
        // Create a DataHandler object
        DataHandler dataHandler = new DataHandler("Test data", "text/plain");
        
        try {
            // Get the OutputStream from the DataHandler
            OutputStream outputStream = dataHandler.getOutputStream();
            
            // Write data to the OutputStream
            outputStream.write("Hello, World!".getBytes());
            
            // Flush and close the OutputStream
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
