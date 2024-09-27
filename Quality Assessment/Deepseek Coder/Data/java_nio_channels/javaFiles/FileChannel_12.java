import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannel_12 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("example.txt");
            FileChannel fc = fos.getChannel();

            String data = "Hello, World!";
            ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());

            int bytesWritten = fc.write(buffer);
            System.out.println("Bytes written: " + bytesWritten);

            fc.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
