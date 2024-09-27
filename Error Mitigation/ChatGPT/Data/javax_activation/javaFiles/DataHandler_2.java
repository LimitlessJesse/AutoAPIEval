import javax.activation.DataHandler;

public class DataHandler_2 {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        String contentType = dataHandler.getContentType();
        System.out.println("Content Type: " + contentType);
    }
}
