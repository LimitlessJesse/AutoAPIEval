import java.io.DataInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class DataInputStream_3 {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        try (DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data))) {
            int readBytes = dis.read(buffer, 0, buffer.length);

            System.out.println("Number of bytes read: " + readBytes);
            System.out.println("Buffer content: ");
            for (byte b : buffer) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
