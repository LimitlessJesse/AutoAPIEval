import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousFileChannel_3 {
    public static void main(String[] args) {
        try {
            Path path = Path.of("example.txt");
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ, StandardOpenOption.WRITE);
            long position = 0;
            long size = 1024;
            boolean shared = false; // Set whether the lock is shared or exclusive

            Future<FileLock> future = fileChannel.lock(position, size, shared);

            FileLock fileLock = future.get(); // Acquire the lock

            // Perform operations with the locked file

            fileLock.release(); // Release the lock when done

            fileChannel.close(); // Close the file channel
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
