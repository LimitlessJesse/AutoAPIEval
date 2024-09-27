import javax.activation.DataHandler;
import javax.activation.DataSource;

public class DataHandler_4 {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource() {
            @Override
            public InputStream getInputStream() throws IOException {
                return null;
            }

            @Override
            public OutputStream getOutputStream() throws IOException {
                return null;
            }

            @Override
            public String getContentType() {
                return null;
            }

            @Override
            public String getName() {
                return "Sample Data";
            }
        };

        DataHandler dataHandler = new DataHandler(dataSource);
        String name = dataHandler.getName();
        System.out.println("Name: " + name);
    }
}
