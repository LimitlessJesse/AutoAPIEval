import java.io.DataInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class DataInputStream_2 {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        try (DataInputStream dis = new DataInputStream(new ByteArrayInputStream("HelloWorld".getBytes()))) {
            int read = dis.read(buffer);
            System.out.println("Number of bytes read: " + read);
            System.out.println("Data read: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
