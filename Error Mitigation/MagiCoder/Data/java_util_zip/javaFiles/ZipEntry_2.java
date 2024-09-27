import java.util.zip.ZipEntry;

public class ZipEntry_2 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("example.txt");
        String name = entry.getName();
        System.out.println("Name of the entry: " + name);
    }
}
