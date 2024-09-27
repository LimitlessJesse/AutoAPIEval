import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class DataBuffer_3 {
    public static void main(String[] args) {
        // Create a new DataBuffer
        DataBuffer db = new DataBufferByte(10, 2);

        // Create a new Raster
        Raster raster = new WritableRaster(db, null);

        // Get the number of banks
        int numBanks = db.getNumBanks();

        System.out.println("Number of banks: " + numBanks);
    }
}
