import java.util.zip.Deflater;

public class Deflater_4 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] input = "Hello, world!".getBytes();
        byte[] output = new byte[input.length];
        deflater.setInput(input);
        deflater.finish();
        int compressedDataLength = deflater.deflate(output);
        System.out.println("Compressed data length: " + compressedDataLength);
        deflater.end();
    }
}
