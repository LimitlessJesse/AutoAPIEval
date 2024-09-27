import java.awt.image.WritableRaster;

public class WritableRaster_5 {
    public static void main(String[] args) {
        WritableRaster raster = null; // Initialize your WritableRaster object
        
        int x = 0;
        int y = 0;
        int w = 10;
        int h = 10;
        int b = 0;
        int[] iArray = new int[w * h]; // Initialize your int array with appropriate size
        
        // Populate iArray with sample values
        
        try {
            raster.setSamples(x, y, w, h, b, iArray);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
