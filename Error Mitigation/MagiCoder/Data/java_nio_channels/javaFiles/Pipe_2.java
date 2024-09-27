import java.nio.channels.Pipe;

public class Pipe_2 {
    public static void main(String[] args) throws Exception {
        Pipe pipe = Pipe.open();
        Pipe.SinkChannel sinkChannel = pipe.sink();
        // Use the sinkChannel for I/O operations...
    }
}
