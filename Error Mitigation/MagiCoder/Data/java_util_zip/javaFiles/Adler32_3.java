import java.util.zip.Adler32;

public class Adler32_3 {
    public static void main(String[] args) {
        Adler32 adler32 = new Adler32();
        adler32.update(65); // 'A'
        adler32.update(66); // 'B'
        adler32.update(67); // 'C'
        long checksum = adler32.getValue();
        System.out.println("Checksum: " + checksum);
    }
}
