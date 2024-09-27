import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannel_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            FileChannel fc = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = fc.read(buffer);
            while (bytesRead!= -1) {
                buffer.flip();
                while(buffer.hasRemaining()){
                    System.out.print((char) buffer.get());
                }
                buffer.clear();
                bytesRead = fc.read(buffer);
            }
            fc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
