import java.awt.image.WritableRaster;

public class WritableRaster_2 {
    public static void main(String[] args) {
        WritableRaster raster = WritableRaster.createWritableRaster(sampleModel, dataBuffer, new Point(0, 0));
        int x = 0;
        int y = 0;
        Object obj = new int[]{255, 255, 255}; // Example pixel data in an array
        raster.setDataElements(x, y, obj);
    }
}
