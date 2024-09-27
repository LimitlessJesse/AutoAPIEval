import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousFileChannel_2 {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        
        try(AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path)) {
            ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
            Future<Integer> operation = fileChannel.write(buffer, 0);
            
            // Wait for the operation to complete and get the result 
            Integer bytesWritten = operation.get();
            System.out.println("Bytes written: " + bytesWritten);
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
