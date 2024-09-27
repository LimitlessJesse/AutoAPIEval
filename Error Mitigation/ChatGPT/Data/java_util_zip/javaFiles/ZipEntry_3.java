import java.util.zip.ZipEntry;

public class ZipEntry_3 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("example.zip");
        long compressedSize = entry.getCompressedSize();
        System.out.println("Compressed Size: " + compressedSize);
    }
}
