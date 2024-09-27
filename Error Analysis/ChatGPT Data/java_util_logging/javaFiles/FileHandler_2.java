import java.util.logging.FileHandler;
import java.io.IOException;

public class FileHandler_2 {
    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            // perform logging operations
            
            fileHandler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
