import java.util.zip.Deflater;

public class Deflater_17 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        //... perform some deflation operations...
        int adler = deflater.getAdler();
        System.out.println("Adler-32 checksum: " + adler);
    }
}
