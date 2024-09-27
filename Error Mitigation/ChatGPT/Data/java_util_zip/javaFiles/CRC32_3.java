import java.util.zip.CRC32;

public class CRC32_3 {
    public static void main(String[] args) {
        CRC32 crc = new CRC32();
        crc.update("Hello, World!".getBytes());
        long checksumValue = crc.getValue();
        System.out.println("CRC-32 value: " + checksumValue);
    }
}
