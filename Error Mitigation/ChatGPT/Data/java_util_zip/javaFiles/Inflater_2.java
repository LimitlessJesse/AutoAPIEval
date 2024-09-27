import java.util.zip.Inflater;

public class Inflater_2 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        byte[] compressedData = {120, -100, 75, 76, 2, 0, 0, 0, 1, 0, 1, -1};
        byte[] decompressedData = new byte[100];

        inflater.setInput(compressedData, 0, compressedData.length);

        try {
            int decompressedBytes = inflater.inflate(decompressedData);
            inflater.end();

            System.out.println("Decompressed data: ");
            for (int i = 0; i < decompressedBytes; i++) {
                System.out.print(decompressedData[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
