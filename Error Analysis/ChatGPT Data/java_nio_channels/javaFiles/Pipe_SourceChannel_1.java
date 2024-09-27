import java.nio.channels.Pipe;

public class Pipe_SourceChannel_1 {
    public static void main(String[] args) {
        Pipe.SourceChannel sourceChannel = Pipe.open().source();
        int operations = sourceChannel.validOps();
        System.out.println("Valid operations for the source channel: " + operations);
    }
}
