import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannel_5 {
    public static void main(String[] args) {
        try (FileChannel fileChannel = FileChannel.open(Paths.get("example.txt"), StandardOpenOption.READ);
             WritableByteChannel targetChannel = FileChannel.open(Paths.get("output.txt"), StandardOpenOption.WRITE)) {

            long position = 0;
            long count = fileChannel.size();
            long bytesTransferred = fileChannel.transferTo(position, count, targetChannel);

            System.out.println("Bytes transferred: " + bytesTransferred);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
