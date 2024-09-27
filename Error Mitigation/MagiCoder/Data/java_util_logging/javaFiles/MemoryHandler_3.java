import java.util.logging.Level;
import java.util.logging.MemoryHandler;

public class MemoryHandler_3 {
    public static void main(String[] args) {
        MemoryHandler handler = new MemoryHandler();
        handler.setPushLevel(Level.INFO);
    }
}
