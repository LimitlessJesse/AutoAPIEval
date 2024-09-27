import javax.activation.DataHandler;

public class DataHandler_2 {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler(null, "text/plain");
        String name = dataHandler.getName();
        System.out.println("Name: " + name);
    }
}
