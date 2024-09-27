import java.util.zip.ZipEntry;

public class ZipEntry_11 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("myFile.txt");
        entry.setCrc(0x12345678L);
        System.out.println("CRC: " + entry.getCrc());
    }
}
