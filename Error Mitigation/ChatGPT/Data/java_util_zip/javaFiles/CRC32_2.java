import java.util.zip.CRC32;

public class CRC32_2 {
    public static void main(String[] args) {
        CRC32 crc = new CRC32();
        crc.update((byte) 'a');
        System.out.println("CRC-32 checksum: " + crc.getValue());
    }
}
