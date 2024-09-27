import java.util.logging.Level;
import java.util.logging.MemoryHandler;

public class MemoryHandler_4 {
    public static void main(String[] args) {
        MemoryHandler memoryHandler = new MemoryHandler();
        Level newLevel = Level.INFO;
        memoryHandler.setPushLevel(newLevel);
    }
}
