import java.nio.channels.Pipe;

public class Pipe_2 {
    public static void main(String[] args) {
        try {
            Pipe pipe = Pipe.open();
            Pipe.SourceChannel sourceChannel = pipe.source();
            System.out.println("Pipe's source channel: " + sourceChannel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
