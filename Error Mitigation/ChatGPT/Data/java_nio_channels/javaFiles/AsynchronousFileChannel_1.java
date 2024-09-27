import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousFileChannel_1 {
    public static void main(String[] args) {
        try {
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(Paths.get("test.txt"), StandardOpenOption.READ);

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            long position = 0;

            Future<Integer> future = fileChannel.read(buffer, position);

            // Wait for the operation to complete
            int bytesRead = future.get();
            System.out.println("Bytes read: " + bytesRead);

            fileChannel.close();
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
