import java.util.zip.CRC32;

public class CRC32_1 {
    public static void main(String[] args) {
        CRC32 crc = new CRC32();
        crc.update(123);
        long checksum = crc.getValue();
        System.out.println(checksum);
    }
}
