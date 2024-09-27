import java.util.zip.Deflater;

public class Deflater_10 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] dictionary = "Hello, World!".getBytes();
        deflater.setDictionary(dictionary);
    }
}
