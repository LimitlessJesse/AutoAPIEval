import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectorProvider;

public class SelectableChannel_4 {
    public static void main(String[] args) {
        SelectableChannel channel = null; // Initialize your SelectableChannel object
        SelectorProvider provider = channel.provider();
        System.out.println("Provider that created this channel: " + provider);
    }
}
