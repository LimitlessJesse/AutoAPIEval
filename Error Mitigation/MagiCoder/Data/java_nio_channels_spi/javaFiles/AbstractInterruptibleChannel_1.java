import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.AbstractSelectionKey;
import java.nio.channels.spi.SelectorProvider;
import java.io.IOException;

public class AbstractInterruptibleChannel_1 {
    public static void main(String[] args) {
        try {
            SelectorProvider provider = SelectorProvider.provider();
            AbstractInterruptibleChannel channel = provider.openChannel(null);
            System.out.println("Channel is open: " + channel.isOpen());
            channel.close();
            System.out.println("Channel is open after closing: " + channel.isOpen());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
