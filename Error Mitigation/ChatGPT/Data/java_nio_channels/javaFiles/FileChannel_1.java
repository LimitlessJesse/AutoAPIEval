import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannel_1 {
    public static void main(String[] args) {
        try (FileChannel fileChannel = FileChannel.open(Paths.get("example.txt"), StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = fileChannel.read(buffer);
            System.out.println("Number of bytes read: " + bytesRead);
        } catch (ClosedChannelException e) {
            e.printStackTrace();
        } catch (AsynchronousCloseException e) {
            e.printStackTrace();
        } catch (ClosedByInterruptException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
