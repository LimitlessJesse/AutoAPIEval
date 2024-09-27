import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

public class AbstractSelectableChannel_1 {
    public static void main(String[] args) {
        AbstractSelectableChannel channel = new AbstractSelectableChannel() {
            @Override
            public SelectorProvider provider() {
                return super.provider();
            }
        };
        
        SelectorProvider provider = channel.provider();
        System.out.println("Provider: " + provider);
    }
}
