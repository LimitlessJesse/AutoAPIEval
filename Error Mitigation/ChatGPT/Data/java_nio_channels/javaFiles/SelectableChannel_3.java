import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.IllegalBlockingModeException;
import java.nio.channels.SelectableChannel;

public class SelectableChannel_3 {
    public static void main(String[] args) {
        SelectableChannel channel = null; // Initialize your SelectableChannel here
        
        try {
            // Adjust the blocking mode of the channel
            channel.configureBlocking(true); // Set to true for blocking mode, false for non-blocking mode
        } catch (ClosedChannelException e) {
            e.printStackTrace();
        } catch (IllegalBlockingModeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
