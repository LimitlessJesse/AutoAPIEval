import java.awt.image.WritableRaster;
import java.awt.image.Raster;

public class WritableRaster_4 {
    public static void main(String[] args) {
        WritableRaster writableRaster = null; // Initialize writableRaster
        Raster inputRaster = null; // Initialize inputRaster
        
        int x = 0; // X coordinate of the pixel location
        int y = 0; // Y coordinate of the pixel location
        
        try {
            writableRaster.setDataElements(x, y, inputRaster);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
