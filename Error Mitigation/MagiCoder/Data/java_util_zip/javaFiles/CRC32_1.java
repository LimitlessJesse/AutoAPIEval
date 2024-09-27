import java.util.zip.CRC32;

public class CRC32_1 {
    public static void main(String[] args) {
        CRC32 crc32 = new CRC32();
        crc32.update(65); // 'A'
        crc32.update(66); // 'B'
        crc32.update(67); // 'C'

        long checksum = crc32.getValue();
        System.out.println("Checksum: " + checksum);
    }
}
