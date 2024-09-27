import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

public class LogManager_2 {
    
    public static void readConfiguration(InputStream ins) throws IOException, SecurityException {
        LogManager manager = LogManager.getLogManager();
        manager.readConfiguration(ins);
    }
    
    public static void main(String[] args) {
        // Example usage
        try {
            readConfiguration(Main.class.getResourceAsStream("logging.properties"));
        } catch (IOException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
