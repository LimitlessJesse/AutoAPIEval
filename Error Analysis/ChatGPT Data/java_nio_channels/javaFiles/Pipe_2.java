import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SourceChannel;

public class Pipe_2 {
    public static void main(String[] args) {
        try {
            Pipe pipe = Pipe.open();
            SourceChannel sourceChannel = pipe.source();
            
            System.out.println("Source channel of the pipe: " + sourceChannel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
