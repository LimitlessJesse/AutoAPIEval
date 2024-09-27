import java.nio.channels.SelectionKey;
import java.nio.channels.SelectableChannel;

public class SelectionKey_2 {
    public static void main(String[] args) {
        SelectionKey selectionKey = new SelectionKey() {
            @Override
            public SelectableChannel channel() {
                return null;
            }

            @Override
            public Selector selector() {
                return null;
            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public int interestOps() {
                return 0;
            }

            @Override
            public SelectionKey interestOps(int ops) {
                return null;
            }

            @Override
            public int readyOps() {
                return 0;
            }
        };

        SelectableChannel channel = selectionKey.channel();
        System.out.println("Channel: " + channel);
    }
}
