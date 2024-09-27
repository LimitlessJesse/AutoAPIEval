import java.io.IOException;
import java.nio.channels.Selector;

public class Selector_3 {
    public static void main(String[] args) {
        try {
            Selector selector = Selector.open();
            int selected = selector.selectNow();
            System.out.println("Number of channels ready: " + selected);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
