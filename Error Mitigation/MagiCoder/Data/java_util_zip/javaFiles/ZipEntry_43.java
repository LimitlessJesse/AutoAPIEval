import java.util.zip.ZipEntry;

public class ZipEntry_43 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("myFile.txt");
        entry.setCompressedSize(1024);
        System.out.println("Compressed size: " + entry.getCompressedSize());
    }
}
