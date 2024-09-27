import java.util.zip.ZipEntry;

public class ZipEntry_24 {
    public static void main(String[] args) {
        ZipEntry zipEntry = new ZipEntry("myFile.txt");
        byte[] extra = {1, 2, 3, 4, 5};
        zipEntry.setExtra(extra);
        
        // You can get the extra data using getExtra() method
        byte[] extraData = zipEntry.getExtra();
        for (byte b : extraData) {
            System.out.print(b + " ");
        }
    }
}
