import java.io.ByteArrayOutputStream;
import java.util.logging.StreamHandler;

public class StreamHandler_1 {
    public static void main(String[] args) {
        StreamHandler handler = new StreamHandler();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        handler.setOutputStream(outputStream);
        
        handler.publish(new java.util.logging.LogRecord(java.util.logging.Level.INFO, "Logging message"));
        
        System.out.println(outputStream.toString());
    }
}
