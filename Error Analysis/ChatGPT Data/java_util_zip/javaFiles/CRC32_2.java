import java.util.zip.CRC32;

public class CRC32_2 {
    public static void main(String[] args) {
        CRC32 crc32 = new CRC32();
        crc32.update("Hello, World!".getBytes());
        long crcValue = crc32.getValue();
        System.out.println("CRC32 Value: " + crcValue);
    }
}
