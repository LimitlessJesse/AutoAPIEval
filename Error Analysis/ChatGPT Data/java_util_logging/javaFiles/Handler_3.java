import java.util.logging.Handler;

public class Handler_3 {
    public static void main(String[] args) {
        
    }
    
    public void closeHandler(Handler handler) {
        try {
            handler.close();
        } catch (SecurityException e) {
            System.err.println("Error occurred while closing the handler: " + e.getMessage());
        }
    }
}
