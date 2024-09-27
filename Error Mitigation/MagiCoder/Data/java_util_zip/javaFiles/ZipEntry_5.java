import java.util.zip.ZipEntry;

public class ZipEntry_5 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("file.txt");
        entry.setSize(1024);
        System.out.println("Uncompressed size: " + entry.getSize());
    }
}
