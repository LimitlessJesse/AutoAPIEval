import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AsynchronousFileChannel_5 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("path_to_your_file");
        AsynchronousFileChannel channel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
        long size = channel.size();
        System.out.println("Size of the file: " + size);
        channel.close();
    }
}
