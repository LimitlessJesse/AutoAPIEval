import java.util.zip.Deflater;

public class Deflater_14 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] input = "Hello, World!".getBytes();
        deflater.setInput(input);
        deflater.finish();
        byte[] output = new byte[deflater.deflate(output)];
        System.out.println("Total input: " + deflater.getTotalIn());
    }
}
