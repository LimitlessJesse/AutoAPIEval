import java.nio.channels.spi.AbstractInterruptibleChannel;

public class AbstractInterruptibleChannel_4 {
    public static void main(String[] args) {
        AbstractInterruptibleChannel channel = new AbstractInterruptibleChannel() {
            // Implementing the begin method
            protected final void begin() {
                System.out.println("Beginning of I/O operation");
            }
        };
        
        // Calling the begin method
        channel.begin();
    }
}
