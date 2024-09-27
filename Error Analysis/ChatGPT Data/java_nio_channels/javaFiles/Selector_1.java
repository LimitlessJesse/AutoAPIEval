import java.nio.channels.Selector;
import java.io.IOException;

public class Selector_1 {
    public static void main(String[] args) {
        try {
            Selector selector = Selector.open();
            int numKeys = selector.select();
            System.out.println("Number of keys selected: " + numKeys);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
