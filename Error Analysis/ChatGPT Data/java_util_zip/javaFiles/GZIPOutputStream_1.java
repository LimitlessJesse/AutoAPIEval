import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("compressedFile.gz");
            GZIPOutputStream gzipOS = new GZIPOutputStream(fos);

            String data = "This is the data to be compressed.";
            byte[] bytes = data.getBytes();

            gzipOS.write(bytes);

            // Finish writing compressed data to the output stream without closing it
            gzipOS.finish();

            gzipOS.close();
            fos.close();
            System.out.println("Data compressed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
