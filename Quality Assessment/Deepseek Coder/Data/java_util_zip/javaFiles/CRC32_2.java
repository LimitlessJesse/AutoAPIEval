import java.util.zip.CRC32;

public class CRC32_2 {
    public static void main(String[] args) {
        // Create a new CRC32 object
        CRC32 crc32 = new CRC32();

        // Create a byte array
        byte[] bytes = "Hello, World!".getBytes();

        // Update the CRC32 checksum with the byte array
        crc32.update(bytes, 0, bytes.length);

        // Get the final CRC32 checksum
        long checksum = crc32.getValue();

        // Print the checksum
        System.out.println("Checksum: " + checksum);
    }
}
