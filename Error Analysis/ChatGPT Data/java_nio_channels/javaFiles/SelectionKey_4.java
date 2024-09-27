import java.nio.channels.SelectionKey;

public class SelectionKey_4 {
    public static void main(String[] args) {
        SelectionKey selectionKey = null; // Obtain a SelectionKey object from somewhere
        int ops = selectionKey.readyOps();
        System.out.println("Ready operations: " + ops);
    }
}
