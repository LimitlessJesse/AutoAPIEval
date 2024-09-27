import java.util.zip.Adler32;

public class Adler32_5 {
    public static void main(String[] args) {
        Adler32 adler32 = new Adler32();
        
        byte[] data = "Hello, World!".getBytes();
        
        // Update the checksum with the data
        adler32.update(data);
        
        // Print the checksum
        System.out.println("Checksum: " + adler32.getValue());
        
        // Reset the checksum
        adler32.reset();
        
        // Print the checksum after reset
        System.out.println("Checksum after reset: " + adler32.getValue());
    }
}
