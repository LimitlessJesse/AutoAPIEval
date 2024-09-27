import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.IOException;

public class FileChannel_2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("output.txt", "rw");
            FileChannel channel = file.getChannel();
            
            String data = "Hello, World!";
            ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
            
            int bytesWritten = channel.write(buffer);
            System.out.println("Number of bytes written: " + bytesWritten);
            
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
