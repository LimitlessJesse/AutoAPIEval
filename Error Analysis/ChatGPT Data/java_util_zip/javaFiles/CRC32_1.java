import java.util.zip.CRC32;

public class CRC32_1 {
    public static void main(String[] args) {
        byte[] data = "Hello, World!".getBytes();
        CRC32 crc = new CRC32();
        crc.update(data);
        
        System.out.println("CRC32 Value: " + crc.getValue());
    }
}
