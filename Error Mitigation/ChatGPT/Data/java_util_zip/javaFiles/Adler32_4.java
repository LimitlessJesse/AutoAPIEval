import java.util.zip.Adler32;

public class Adler32_4 {
    public static void main(String[] args) {
        Adler32 adler = new Adler32();
        adler.update("Hello, World!".getBytes());
        long checksumValue = adler.getValue();
        System.out.println("Checksum value: " + checksumValue);
    }
}
