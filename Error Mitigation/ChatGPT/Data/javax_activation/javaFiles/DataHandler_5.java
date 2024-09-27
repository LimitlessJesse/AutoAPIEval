import javax.activation.DataHandler;
import java.io.IOException;
import java.io.OutputStream;

public class DataHandler_5 {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        OutputStream os = System.out;
        try {
            dataHandler.writeTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
