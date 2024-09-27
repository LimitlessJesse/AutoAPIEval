import java.awt.image.Raster;

public class Raster_3 {
    public static void main(String[] args) {
        Raster raster = // Get the Raster object
        int x = 0; // x coordinate
        int y = 0; // y coordinate
        int[] iArray = new int[1]; // Array to store pixel values
        
        iArray = raster.getPixel(x, y, iArray);
        System.out.println("Pixel value at (" + x + "," + y + "): " + iArray[0]);
    }
}
