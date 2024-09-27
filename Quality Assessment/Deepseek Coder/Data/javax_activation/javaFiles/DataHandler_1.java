import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.InputStream;

public class DataHandler_1 {
    public static void main(String[] args) {
        try {
            DataSource dataSource = new FileDataSource("path_to_your_file");
            DataHandler dataHandler = new DataHandler(dataSource);
            InputStream inputStream = dataHandler.getContent();
            int data = inputStream.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
