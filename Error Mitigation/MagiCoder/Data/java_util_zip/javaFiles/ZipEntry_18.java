import java.util.zip.ZipEntry;

public class ZipEntry_18 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("directory/");
        boolean isDirectory = entry.isDirectory();
        System.out.println("Is directory: " + isDirectory);
    }
}
