import java.util.zip.ZipEntry;

public class ZipEntry_42 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("file.txt");
        entry.setCompressedSize(1024);
        System.out.println("Compressed size: " + entry.getCompressedSize());
    }
}
