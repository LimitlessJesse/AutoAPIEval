import java.awt.image.WritableRaster;

public class WritableRaster_3 {
    public static void main(String[] args) {
        WritableRaster raster = null; // Initialize your WritableRaster object
        
        int x = 0;
        int y = 0;
        int w = 10;
        int h = 10;
        int[] iArray = new int[w * h]; // Initialize your int array
        
        try {
            raster.setPixels(x, y, w, h, iArray);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
