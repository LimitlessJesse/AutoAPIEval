import java.util.zip.CRC32;

public class CRC32_2 {
    public static void main(String[] args) {
        CRC32 crc32 = new CRC32();
        byte[] data = "Hello, World!".getBytes();
        crc32.update(data, 0, data.length);
        long checksum = crc32.getValue();
        System.out.println("Checksum: " + checksum);
    }
}
