import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.Deflater;
import java.io.ByteArrayInputStream;

public class DeflaterInputStream_4 {
    public static void main(String[] args) {
        byte[] input = "Hello, World!".getBytes();
        Deflater deflater = new Deflater();
        DeflaterInputStream deflaterInputStream = new DeflaterInputStream(new ByteArrayInputStream(input), deflater);
        
        try {
            deflaterInputStream.close();
            System.out.println("DeflaterInputStream closed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
