import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ClosedByInterruptException;

public class AbstractInterruptibleChannel_5 {
    public static void main(String[] args) {
        AbstractInterruptibleChannel channel = new AbstractInterruptibleChannel() {
            // Implementing the end method
            protected final void end(boolean completed) throws AsynchronousCloseException, ClosedByInterruptException {
                // Your implementation here
            }
        };
    }
}
