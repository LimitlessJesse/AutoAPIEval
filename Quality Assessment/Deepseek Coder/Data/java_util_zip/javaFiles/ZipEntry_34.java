import java.util.zip.ZipEntry;

public class ZipEntry_34 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("myFile.txt");
        entry.setComment("This is a comment");
        System.out.println("Comment: " + entry.getComment());
    }
}
