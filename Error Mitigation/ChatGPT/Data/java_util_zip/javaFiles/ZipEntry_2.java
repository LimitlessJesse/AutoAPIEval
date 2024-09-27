import java.util.zip.ZipEntry;

public class ZipEntry_2 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("example.zip");
        long size = entry.getSize();
        System.out.println("Uncompressed size: " + size);
    }
}
