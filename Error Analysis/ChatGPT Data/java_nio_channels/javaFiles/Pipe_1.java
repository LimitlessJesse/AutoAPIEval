import java.nio.channels.Pipe;

public class Pipe_1 {
    public static void main(String[] args) {
        try {
            Pipe pipe = Pipe.open();
            Pipe.SinkChannel sinkChannel = pipe.sink();

            String data = "Hello, Pipe!";
            sinkChannel.write(java.nio.ByteBuffer.wrap(data.getBytes()));

            sinkChannel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
