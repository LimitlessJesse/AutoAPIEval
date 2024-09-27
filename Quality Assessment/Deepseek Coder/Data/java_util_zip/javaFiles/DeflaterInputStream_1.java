import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;

public class DeflaterInputStream_1 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] input = data.getBytes();

        // Compress the data
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(bos);
        try {
            dos.write(input);
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] compressedData = bos.toByteArray();

        // Decompress the data
        ByteArrayOutputStream decompressedBos = new ByteArrayOutputStream();
        DeflaterInputStream dis = new DeflaterInputStream(new ByteArrayInputStream(compressedData));
        byte[] buffer = new byte[1024];
        int len;
        try {
            while ((len = dis.read(buffer)) > 0) {
                decompressedBos.write(buffer, 0, len);
            }
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] decompressedData = decompressedBos.toByteArray();

        // Print the decompressed data
        System.out.println(new String(decompressedData));
    }
}
