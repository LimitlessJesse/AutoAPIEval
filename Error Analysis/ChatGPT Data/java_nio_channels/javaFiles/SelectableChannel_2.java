import java.nio.channels.SelectableChannel;

public class SelectableChannel_2 {
    public static void main(String[] args) {
        // Assume channel is initialized and obtained elsewhere
        SelectableChannel channel = null;

        try {
            // Set blocking mode to true
            channel.configureBlocking(true);

            System.out.println("Blocking mode set to true.");
        } catch (Exception e) {
            System.out.println("Error setting blocking mode: " + e.getMessage());
        }
    }
}
