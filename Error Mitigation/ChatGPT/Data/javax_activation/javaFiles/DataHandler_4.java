import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.URLDataSource;
import java.io.IOException;
import java.io.OutputStream;

public class DataHandler_4 {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler(new URLDataSource());
        
        try {
            OutputStream outputStream = dataHandler.getOutputStream();
            if (outputStream != null) {
                // Perform operations with the outputStream
                System.out.println("OutputStream obtained successfully");
            } else {
                System.out.println("OutputStream is null");
            }
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
