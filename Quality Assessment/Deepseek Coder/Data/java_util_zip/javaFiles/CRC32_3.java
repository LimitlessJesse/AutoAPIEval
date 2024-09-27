import java.util.zip.CRC32;

public class CRC32_3 {
    public static void main(String[] args) {
        CRC32 crc = new CRC32();
        byte[] bytes = "Hello, World!".getBytes();
        
        // Update the CRC with the bytes
        crc.update(bytes);
        
        // Print the CRC value
        System.out.println("CRC value after update: " + crc.getValue());
        
        // Reset the CRC
        crc.reset();
        
        // Print the CRC value after reset
        System.out.println("CRC value after reset: " + crc.getValue());
    }
}
