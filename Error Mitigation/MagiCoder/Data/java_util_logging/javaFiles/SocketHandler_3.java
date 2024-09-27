import java.util.logging.LogRecord;
import java.util.logging.SocketHandler;

public class SocketHandler_3 {
    public static void main(String[] args) {
        SocketHandler socketHandler = new SocketHandler();
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a test log message");
        socketHandler.publish(logRecord);
    }
}
