import javax.activation.DataHandler;
import javax.activation.DataSource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DataHandler_5 {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler(new MyDataSource());
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            dataHandler.writeTo(outputStream);
            System.out.println("DataHandler content: " + outputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class MyDataSource implements DataSource {
        @Override
        public String getContentType() {
            return "text/plain";
        }

        @Override
        public InputStream getInputStream() throws IOException {
            return null; // Return input stream of data
        }

        @Override
        public String getName() {
            return "MyDataSource";
        }

        @Override
        public OutputStream getOutputStream() throws IOException {
            return null; // Return output stream where data will be written
        }
    }
}
