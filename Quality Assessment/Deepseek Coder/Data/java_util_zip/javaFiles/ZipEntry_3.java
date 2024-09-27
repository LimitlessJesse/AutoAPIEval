import java.util.zip.ZipEntry;

public class ZipEntry_3 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("test.txt");
        entry.setCompressedSize(100);
        System.out.println(entry.getCompressedSize());
    }
}
