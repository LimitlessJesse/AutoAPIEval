import java.util.zip.ZipEntry;

public class ZipEntry_1 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("example.txt");
        System.out.println("Entry name: " + entry.getName());
    }
}
