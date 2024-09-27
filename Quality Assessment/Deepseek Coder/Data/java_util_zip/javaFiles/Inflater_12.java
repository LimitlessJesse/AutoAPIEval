import java.util.zip.Inflater;
import java.util.zip.DataFormatException;

public class Inflater_12 {
    public static void main(String[] args) {
        try {
            // Create an Inflater instance
            Inflater inflater = new Inflater();

            // Compressed data
            byte[] compressedData = new byte[] { 0x12, 0x34, 0x56, 0x78 };

            // Decompress the data
            inflater.setInput(compressedData);
            byte[] decompressedData = new byte[1024];
            int decompressedDataLength = inflater.inflate(decompressedData);

            // Print the decompressed data
            System.out.println("Decompressed data:");
            for (int i = 0; i < decompressedDataLength; i++) {
                System.out.print(decompressedData[i] + " ");
            }

            // Reset the Inflater
            inflater.reset();

            // Decompress the data again
            inflater.setInput(compressedData);
            decompressedDataLength = inflater.inflate(decompressedData);

            // Print the decompressed data
            System.out.println("\nDecompressed data after reset:");
            for (int i = 0; i < decompressedDataLength; i++) {
                System.out.print(decompressedData[i] + " ");
            }
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
    }
}
