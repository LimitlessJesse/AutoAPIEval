import java.nio.channels.spi.AbstractInterruptibleChannel;

public class AbstractInterruptibleChannel_2 {
    public static void main(String[] args) {
        AbstractInterruptibleChannel channel = new AbstractInterruptibleChannel() {
            @Override
            public void close() {
                // implementation of close method
            }
        };
        
        System.out.println("Is channel open? " + channel.isOpen());
    }
}
