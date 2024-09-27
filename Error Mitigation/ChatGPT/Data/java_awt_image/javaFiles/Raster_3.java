import java.awt.image.Raster;

public class Raster_3 {
    public static void main(String[] args) {
        Raster raster = null; // Initialize Raster object
        int x = 0; // X coordinate of the pixel location
        int y = 0; // Y coordinate of the pixel location
        int[] iArray = new int[3]; // Preallocated int array
        
        // Call getPixel method to retrieve samples for the specified pixel
        int[] samples = raster.getPixel(x, y, iArray);
        
        // Print the samples for the specified pixel
        for (int sample : samples) {
            System.out.println(sample);
        }
    }
}
