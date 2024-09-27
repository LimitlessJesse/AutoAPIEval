import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousSocketChannel_2 {
    public static void main(String[] args) {
        AsynchronousSocketChannel channel = null; // initialize your channel
        
        ByteBuffer buffer = ByteBuffer.allocate(1024); // create a buffer
        
        Future<Integer> future = channel.write(buffer); // initiate asynchronous write operation
        
        try {
            int bytesWritten = future.get(); // get the number of bytes written
            System.out.println("Bytes written: " + bytesWritten);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
