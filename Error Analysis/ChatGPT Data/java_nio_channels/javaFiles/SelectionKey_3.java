import java.nio.channels.SelectionKey;

public class SelectionKey_3 {
    public static void main(String[] args) {
        SelectionKey key = // get SelectionKey instance
        int interestOps = key.interestOps();
        System.out.println("Interest Ops: " + interestOps);
    }
}
