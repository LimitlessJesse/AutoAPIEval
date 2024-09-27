import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.io.IOException;

public class AbstractInterruptibleChannel_2 {
    public static void main(String[] args) {
        AbstractInterruptibleChannel channel = null;
        try {
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
