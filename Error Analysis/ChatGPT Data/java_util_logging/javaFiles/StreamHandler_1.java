import java.util.logging.StreamHandler;
import java.io.OutputStream;

public class StreamHandler_1 {
    public static void main(String[] args) {
        StreamHandler handler = new StreamHandler();
        OutputStream outputStream = System.out;
        handler.setOutputStream(outputStream);
    }
}
