import java.util.zip.ZipEntry;

public class ZipEntry_5 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("example/");
        boolean isDirectory = entry.isDirectory();
        System.out.println("Is directory: " + isDirectory);
    }
}
