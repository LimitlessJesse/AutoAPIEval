import java.util.logging.*;

public class MemoryHandler_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MemoryHandler_4.class.getName());
        MemoryHandler handler = new MemoryHandler(logger, 10, Level.INFO);

        try {
            handler.close();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
