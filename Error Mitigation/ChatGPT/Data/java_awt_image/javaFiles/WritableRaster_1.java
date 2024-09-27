import java.awt.image.WritableRaster;

public class WritableRaster_1 {
    public static void main(String[] args) {
        WritableRaster raster = null; // Initialize WritableRaster object
        
        int x = 0; // X coordinate of the pixel location
        int y = 0; // Y coordinate of the pixel location
        int[] iArray = {255, 0, 0}; // Input samples in an int array
        
        try {
            raster.setPixel(x, y, iArray); // Set pixel using setPixel method
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
