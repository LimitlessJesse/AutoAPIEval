import java.awt.image.ColorModel;
import java.awt.image.ImageFilter;

public class ImageFilter_5 {
    public static void main(String[] args) {
        // Create an instance of ImageFilter
        ImageFilter imageFilter = new ImageFilter();
        
        // Set pixels with specified parameters
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 100;
        ColorModel model = ColorModel.getRGBdefault();
        int[] pixels = new int[w * h];
        int offset = 0;
        int scansize = w;
        imageFilter.setPixels(x, y, w, h, model, pixels, offset, scansize);
    }
}
