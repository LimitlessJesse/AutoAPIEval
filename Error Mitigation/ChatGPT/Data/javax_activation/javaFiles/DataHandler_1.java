import javax.activation.DataHandler;
import javax.activation.DataSource;

public class DataHandler_1 {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        DataSource dataSource = dataHandler.getDataSource();
        System.out.println(dataSource);
    }
}
