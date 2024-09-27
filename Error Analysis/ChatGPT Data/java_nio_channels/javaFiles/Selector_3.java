import java.io.IOException;
import java.nio.channels.Selector;

public class Selector_3 {
    public static void main(String[] args) {
        try {
            Selector selector = Selector.open();
            // Add code here to use selector.select(timeout)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
