import java.nio.channels.Selector;
import java.io.IOException;

public class Selector_5 {
    public static void main(String[] args) {
        try {
            Selector selector = Selector.open();
            int keysReady = selector.selectNow();
            System.out.println("Number of keys ready: " + keysReady);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
