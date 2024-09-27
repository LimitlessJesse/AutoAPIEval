import java.util.zip.Adler32;

public class Adler32_2 {
    public static void main(String[] args) {
        Adler32 adler = new Adler32();
        adler.update((byte) 'a');
        System.out.println("Adler-32 checksum: " + adler.getValue());
    }
}
