import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCacheImageOutputStream_5 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileCacheImageOutputStream outputStream = new FileCacheImageOutputStream(file);

            byte[] buffer = new byte[1024];
            int bytesRead = outputStream.read(buffer, 0, buffer.length);

            if (bytesRead!= -1) {
                System.out.println("Bytes read: " + bytesRead);
                System.out.println("Content: " + new String(buffer, 0, bytesRead));
            } else {
                System.out.println("No bytes read");
            }

            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
