import java.nio.channels.Pipe;

public class Pipe_1 {
    public static void main(String[] args) {
        try {
            Pipe pipe = Pipe.open();
            Pipe.SinkChannel sinkChannel = pipe.sink();
            System.out.println("Sink channel: " + sinkChannel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
