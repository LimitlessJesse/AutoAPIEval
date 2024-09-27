import java.util.zip.Adler32;

public class Adler32_1 {
    public static void main(String[] args) {
        Adler32 adler = new Adler32();
        byte[] data = "Hello, World!".getBytes();
        adler.update(data, 0, data.length);
        System.out.println("Adler-32 checksum: " + adler.getValue());
    }
}
