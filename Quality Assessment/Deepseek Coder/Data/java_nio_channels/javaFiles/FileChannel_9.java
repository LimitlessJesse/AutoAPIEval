import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class FileChannel_9 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            FileChannel channel = raf.getChannel();

            // Get the file's current size
            long fileSize = channel.size();

            // Set the position to the end of the file
            channel.position(fileSize);

            // Write to the file
            channel.write(channel.map(FileChannel.MapMode.READ_WRITE, 0, fileSize));

            // Close the channel and the file
            channel.close();
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
