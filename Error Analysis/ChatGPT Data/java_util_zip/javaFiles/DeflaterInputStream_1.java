import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_1 {
    public static void main(String[] args) {
        byte[] input = new byte[] {72, 101, 108, 108, 111}; // "Hello" in byte array
        ByteArrayInputStream bais = new ByteArrayInputStream(input);
        DeflaterInputStream dis = new DeflaterInputStream(bais);
        
        byte[] buffer = new byte[10];
        try {
            int bytesRead = dis.read(buffer, 0, buffer.length);
            System.out.println("Number of bytes read: " + bytesRead);
            System.out.print("Read bytes: ");
            for (int i = 0; i < bytesRead; i++) {
                System.out.print(buffer[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
