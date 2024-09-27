import java.util.zip.Deflater;

public class Deflater_1 {
    public static void main(String[] args) {
        byte[] input = { 65, 66, 67, 68, 69 }; // Input data
        Deflater deflater = new Deflater();
        deflater.setInput(input);
        deflater.finish();

        byte[] output = new byte[input.length];
        int compressedDataLength = deflater.deflate(output, 0, input.length);

        System.out.println("Compressed data length: " + compressedDataLength);
        System.out.println("Compressed output: ");
        for (int i = 0; i < compressedDataLength; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
