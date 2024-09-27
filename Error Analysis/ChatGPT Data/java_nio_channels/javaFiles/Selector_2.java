import java.nio.channels.Selector;
import java.util.Set;

public class Selector_2 {
    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        
        // Add some keys to the selector
        
        Set<SelectionKey> keys = selector.keys();
        
        System.out.println("Keys in Selector: " + keys);
    }
}
