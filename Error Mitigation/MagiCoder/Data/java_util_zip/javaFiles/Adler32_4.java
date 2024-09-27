import java.util.zip.Adler32;

public class Adler32_4 {
    public static void main(String[] args) {
        Adler32 adler32 = new Adler32();
        String data = "Hello, World!";
        byte[] bytes = data.getBytes();
        adler32.update(bytes, 0, bytes.length);
        long checksum = adler32.getValue();
        System.out.println("Checksum: " + checksum);
    }
}
