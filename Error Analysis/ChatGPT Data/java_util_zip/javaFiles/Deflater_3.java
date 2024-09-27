import java.util.zip.Deflater;

public class Deflater_3 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] input = "Hello, world!".getBytes();
        deflater.setInput(input);
        deflater.finish();
        
        int adler = deflater.getAdler();
        System.out.println("Adler value: " + adler);
    }
}
