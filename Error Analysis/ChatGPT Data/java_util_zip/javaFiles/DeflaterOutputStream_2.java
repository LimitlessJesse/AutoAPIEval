import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_2 {
    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             DeflaterOutputStream dos = new DeflaterOutputStream(baos)) {
             
            byte[] data = {65, 66, 67, 68, 69}; // Sample byte array
            dos.write(data, 1, 3); // Write 3 bytes starting from index 1
            
            dos.finish();
            dos.close();
            
            byte[] compressedData = baos.toByteArray();
            System.out.println("Compressed data: " + new String(compressedData));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
