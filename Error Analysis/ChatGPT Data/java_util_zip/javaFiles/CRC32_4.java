import java.util.zip.CRC32;

public class CRC32_4 {
    public static void main(String[] args) {
        CRC32 crc32 = new CRC32();
        int byteValue = 65; // ASCII value of character 'A'
        crc32.update(byteValue);
        System.out.println("CRC-32 checksum after updating with byte value: " + crc32.getValue());
    }
}
