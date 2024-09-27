import java.util.zip.CRC32;

public class CRC32_4 {
    public static void main(String[] args) {
        // Create a new CRC32 object
        CRC32 crc = new CRC32();

        // Update the CRC32 checksum with some data
        crc.update("Hello, World!".getBytes());

        // Get the final CRC32 checksum value
        long checksum = crc.getValue();

        // Print the checksum
        System.out.println("CRC32 Checksum: " + checksum);
    }
}
