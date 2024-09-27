import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousFileChannel_2 {
    public static void main(String[] args) {
        try {
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(Paths.get("test.txt"), StandardOpenOption.WRITE);
            ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
            long position = 0;

            Future<Integer> future = fileChannel.write(buffer, position);

            future.get(); // Wait for the write operation to complete

            fileChannel.close();
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
