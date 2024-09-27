import java.util.zip.Deflater;

public class Deflater_5 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        int compressionLevel = 9; // Highest compression level
        deflater.setLevel(compressionLevel);
        
        System.out.println("Compression level set to: " + deflater.level());
    }
}
