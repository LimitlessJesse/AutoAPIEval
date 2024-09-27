import java.util.zip.ZipEntry;

public class ZipEntry_33 {
    public static void main(String[] args) {
        ZipEntry zipEntry = new ZipEntry("test.txt");
        String name = zipEntry.getName();
        System.out.println("Name of the ZipEntry: " + name);
    }
}
