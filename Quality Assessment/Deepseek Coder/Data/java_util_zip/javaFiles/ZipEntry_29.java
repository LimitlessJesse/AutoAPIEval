import java.util.zip.ZipEntry;

public class ZipEntry_29 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("test.txt");
        entry.setSize(1024);
        System.out.println("Size of the ZipEntry: " + entry.getSize());
    }
}
