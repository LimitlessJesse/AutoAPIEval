import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Set;

public class Selector_4 {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        // Assume we have some SelectionKey objects selected
        //...

        // Get the set of selected keys
        Set<SelectionKey> selectedKeys = selector.selectedKeys();

        // Iterate over the selected keys
        for (SelectionKey key : selectedKeys) {
            // Perform operations on the selected key
            //...
        }

        // Remove the processed keys from the selected keys set
        selectedKeys.clear();
    }
}
