import java.util.zip.ZipEntry;

public class ZipEntry_4 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("example.zip");
        long modificationTime = entry.getTime();
        System.out.println("Last modification time: " + modificationTime);
    }
}
