import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class InflaterOutputStream_4 {
    public static void main(String[] args) {
        byte[] compressedData = { /* your compressed data here */ };
        byte[] decompressedData = decompressData(compressedData);
        System.out.println(new String(decompressedData));
    }

    private static byte[] decompressData(byte[] compressedData) {
        Inflater inflater = new Inflater();
        inflater.setInput(compressedData);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(compressedData.length);
        try (InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(outputStream, inflater)) {
            inflaterOutputStream.write(compressedData);
            inflaterOutputStream.finish(); // Finish inflation
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputStream.toByteArray();
    }
}
