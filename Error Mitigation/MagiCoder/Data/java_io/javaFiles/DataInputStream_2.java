import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_2 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("input.txt"))) {
            byte[] buffer = new byte[1024];
            int bytesRead = dis.read(buffer);
            while (bytesRead!= -1) {
                // process the data in the buffer
                bytesRead = dis.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
