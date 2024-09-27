import java.util.zip.Adler32;

public class Adler32_1 {
    public static void main(String[] args) {
        Adler32 adler32 = new Adler32();
        adler32.update("Hello, World!".getBytes());
        long checksum = adler32.getValue();
        System.out.println("Checksum: " + checksum);
    }
}
