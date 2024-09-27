import java.util.logging.*;

public class MemoryHandler_11 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MemoryHandler_11.class.getName());
        Handler handler = new MemoryHandler(logger, 10, Level.INFO);
        handler.setLevel(Level.SEVERE);
        
        logger.severe("This is a severe message");
        logger.info("This is an info message");
    }
}
