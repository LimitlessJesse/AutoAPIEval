import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.activation.DataHandler;

public class DataHandler_8 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data.getBytes());
        DataHandler dataHandler = new DataHandler(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            dataHandler.writeTo(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(outputStream.toString());
    }
}
