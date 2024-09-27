import java.util.zip.CRC32;

public class CRC32_1 {
    public static void main(String[] args) {
        CRC32 crc = new CRC32();
        byte[] data = "Hello, World!".getBytes();
        crc.update(data, 0, data.length);
        System.out.println("CRC-32 checksum: " + crc.getValue());
    }
}
