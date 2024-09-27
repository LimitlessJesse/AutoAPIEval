import java.util.zip.ZipEntry;

public class ZipEntry_31 {
    public static void main(String[] args) {
        ZipEntry ze = new ZipEntry("test.txt");
        long crc = ze.getCrc();
        System.out.println("CRC: " + crc);
    }
}
