import java.util.zip.Deflater;

public class Deflater_6 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] input = {1, 2, 3, 4, 5};
        deflater.setInput(input, 0, input.length);
        deflater.finish();
        
        byte[] output = new byte[1024];
        int compressedDataLength = deflater.deflate(output);
        System.out.println("Compressed data length: " + compressedDataLength);
        
        deflater.end();
    }
}
