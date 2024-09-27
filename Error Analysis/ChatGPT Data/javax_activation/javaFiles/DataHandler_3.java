import javax.activation.DataSource;
import javax.activation.DataHandler;

public class DataHandler_3 {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler(new DataSource());
        DataSource dataSource = dataHandler.getDataSource();
    }
}
