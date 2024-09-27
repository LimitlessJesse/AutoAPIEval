import java.util.zip.Deflater;

public class Deflater_25 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] dictionary = "Hello, World!".getBytes();
        deflater.setDictionary(dictionary);
    }
}
