import java.nio.channels.Pipe;
import java.io.IOException;

public class Pipe_SinkChannel_5 {
    public static void main(String[] args) {
        try {
            Pipe.SinkChannel sinkChannel = Pipe.open().sink();
            int ops = sinkChannel.validOps();
            System.out.println("Valid operations: " + ops);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
