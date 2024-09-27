import java.util.zip.CRC32;

public class CRC32_4 {
    public static void main(String[] args) {
        CRC32 crc32 = new CRC32();
        crc32.update(123); // Update the CRC-32 with the byte.
        long value = crc32.getValue(); // Get the CRC-32 value.
        System.out.println("CRC-32 value: " + value);
    }
}
