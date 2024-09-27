import java.util.zip.CRC32;
import java.nio.ByteBuffer;

public class CRC32_5 {
    public static void main(String[] args) {
        CRC32 crc = new CRC32();
        ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
        crc.update(buffer);
        System.out.println("CRC-32 value: " + crc.getValue());
    }
}
