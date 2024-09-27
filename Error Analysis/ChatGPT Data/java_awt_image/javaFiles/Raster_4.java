import java.awt.image.Raster;

public class Raster_4 {
    public static void main(String[] args) {
        // Create a Raster object
        Raster raster = null; // Initialize with actual Raster object
        
        // Call getSample method
        int x = 0; // Sample x coordinate
        int y = 0; // Sample y coordinate
        int b = 0; // Band number
        int sampleValue = raster.getSample(x, y, b);
        
        System.out.println("Sample value at (" + x + ", " + y + ") in band " + b + ": " + sampleValue);
    }
}
