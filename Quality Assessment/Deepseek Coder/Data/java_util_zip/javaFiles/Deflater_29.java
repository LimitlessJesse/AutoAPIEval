import java.util.zip.Deflater;

public class Deflater_29 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        deflater.setLevel(Deflater.BEST_COMPRESSION);
        System.out.println("Compression level: " + deflater.getLevel());
    }
}
