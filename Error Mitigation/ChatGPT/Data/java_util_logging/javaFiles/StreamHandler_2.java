import java.util.logging.StreamHandler;

public class StreamHandler_2 {
    public static void main(String[] args) {
        StreamHandler handler = new StreamHandler();
        try {
            handler.setEncoding("UTF-8");
        } catch (SecurityException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
