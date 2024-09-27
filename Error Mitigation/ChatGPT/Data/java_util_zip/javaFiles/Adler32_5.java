import java.util.zip.Adler32;
import java.nio.ByteBuffer;

public class Adler32_5 {
    public static void main(String[] args) {
        Adler32 adler = new Adler32();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // Populate buffer with data
        adler.update(buffer);
        System.out.println("Adler-32 checksum: " + adler.getValue());
    }
}
