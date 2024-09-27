import java.util.zip.Deflater;

public class Deflater_4 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        int compressionLevel = 6; // Example compression level
        deflater.setLevel(compressionLevel);
    }
}
