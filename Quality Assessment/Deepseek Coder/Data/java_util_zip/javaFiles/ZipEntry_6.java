import java.util.zip.ZipEntry;

public class ZipEntry_6 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("dir/");
        boolean isDirectory = entry.isDirectory();
        System.out.println("Is the entry a directory? " + isDirectory);
    }
}
