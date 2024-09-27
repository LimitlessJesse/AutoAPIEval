import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_3 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("input.txt"))) {
            byte[] buffer = new byte[1024];
            int bytesRead = dis.read(buffer, 0, buffer.length);
            while (bytesRead!= -1) {
                // Process the data in the buffer
                //...
                bytesRead = dis.read(buffer, 0, buffer.length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
