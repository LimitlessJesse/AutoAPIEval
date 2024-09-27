import java.util.zip.CRC32;

public class CRC32_5 {
    public static void main(String[] args) {
        // Create a new CRC32 object
        CRC32 crc = new CRC32();
        
        // Update the CRC32 checksum with the specified data
        byte[] data = "Hello, World!".getBytes();
        crc.update(data, 0, data.length);
        
        // Get the updated CRC32 checksum value
        long checksumValue = crc.getValue();
        
        System.out.println("CRC32 checksum value: " + checksumValue);
    }
}
