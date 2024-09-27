import java.awt.image.WritableRaster;

public class WritableRaster_3 {
    public static void main(String[] args) {
        WritableRaster raster = null; // Initialize your WritableRaster object
        
        int x = 0; // Specify x coordinate
        int y = 0; // Specify y coordinate
        int[] iArray = {255, 255, 255}; // Specify the RGB values
        
        raster.setPixel(x, y, iArray);
    }
}
