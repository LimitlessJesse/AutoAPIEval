import java.nio.channels.Pipe;

public class Pipe_1 {
    public static void main(String[] args) throws Exception {
        Pipe pipe = Pipe.open();
        Pipe.SourceChannel sourceChannel = pipe.source();
        // Use the sourceChannel here...
    }
}
